package case_study_module2.service;

import case_study_module2.common.Regex;
import case_study_module2.model.House;
import case_study_module2.repository.HouseRepository;
import case_study_module2.repository.impl.IHouseRepository;
import case_study_module2.service.impl.IHouseService;

import java.util.List;
import java.util.Scanner;

public class HouseService implements IHouseService {
    Scanner scanner = new Scanner(System.in);
    IHouseRepository iHouseRepository = new HouseRepository();
    public void display() {
        List<House> result = iHouseRepository.display();
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
        String standardRoom;
        do {
            System.out.println("Enter new standard room:");
            standardRoom = scanner.nextLine();
        } while (!Regex.checkName(standardRoom));
        String amountFloor;
        do {
            System.out.println("Enter new amount floor:");
            amountFloor = scanner.nextLine();
        } while (Integer.parseInt(amountFloor) > 0);
        House house = new House(nameService,areaUses,costRent,amountPeople,typeRent,standardRoom,amountFloor);
        iHouseRepository.add(house);
    }
}
