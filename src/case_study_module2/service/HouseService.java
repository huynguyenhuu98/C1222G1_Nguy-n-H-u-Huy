package case_study_module2.service;

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
        System.out.println("Enter new standard room:");
        String standardRoom = scanner.nextLine();
        System.out.println("Enter new amount floor:");
        String amountFloor = scanner.nextLine();
        House house = new House(nameService,areaUses,costRent,amountPeople,typeRent,standardRoom,amountFloor);
        iHouseRepository.add(house);
    }
}
