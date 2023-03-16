package case_study_module2.service;

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
        System.out.println("Enter new name service:");
        String nameService = scanner.nextLine();
        System.out.println("Enter new area uses:");
        String areaUses = scanner.nextLine();
        System.out.println("Enter new cost rent:");
        String costRent = scanner.nextLine();
        System.out.println("Enter new amount people:");
        String amountPeople = scanner.nextLine();
        System.out.println("Enter new type rent:");
        String typeRent = scanner.nextLine();
        System.out.println("Enter new free service:");
        String freeService = scanner.nextLine();
        Room house = new Room(nameService,areaUses,costRent,amountPeople,typeRent,freeService);
        iRoomRepository.add(house);
    }
}
