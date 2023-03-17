package case_study_module2.service;

import case_study_module2.common.Regex;
import case_study_module2.model.Room;
import case_study_module2.repository.RoomRepository;
import case_study_module2.repository.impl.IRoomRepository;
import case_study_module2.service.impl.IRoomService;

import java.util.List;
import java.util.Scanner;

public class RoomService implements IRoomService {
    Scanner scanner = new Scanner(System.in);
    IRoomRepository iRoomRepository = new RoomRepository();
    public void display() {
        List<Room> result = iRoomRepository.display();
        System.out.println(result);
    }
    public void add() {
        String nameService;
        do {
            System.out.println("Enter new name service:");
            nameService = scanner.nextLine();
        } while (!Regex.checkName(nameService));
        String areaUses;
        do {
            System.out.println("Enter new area uses:");
            areaUses = scanner.nextLine();
        } while (Double.parseDouble(areaUses) <= 30);
        String costRent;
        do {
            System.out.println("Enter new cost rent:");
            costRent = scanner.nextLine();
        } while (Double.parseDouble(costRent) > 0);
        String amountPeople;
        do {
            System.out.println("Enter new amount people:");
            amountPeople = scanner.nextLine();
        } while (Double.parseDouble(amountPeople) <= 0 || Double.parseDouble(amountPeople) >= 20);
        String typeRent;
        do {
            System.out.println("Enter new type rent:");
            typeRent = scanner.nextLine();
        } while (!Regex.checkName(typeRent));
        String freeService;
        do {
            System.out.println("Enter new free service:");
            freeService = scanner.nextLine();
        } while (!Regex.checkName(freeService));
        Room house = new Room(nameService,areaUses,costRent,amountPeople,typeRent,freeService);
        iRoomRepository.add(house);
    }
}
