package case_study_module2.service;

import case_study_module2.common.Regex;
import case_study_module2.model.Villa;
import case_study_module2.repository.VillaRepository;
import case_study_module2.repository.impl.IVillaRepository;
import case_study_module2.service.impl.IVillaService;
import java.util.List;
import java.util.Scanner;

public class VillaService implements IVillaService {
    Scanner scanner = new Scanner(System.in);
    IVillaRepository iVillaRepository = new VillaRepository();
    public void display() {
        List<Villa> result = iVillaRepository.display();
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
        String standard;
        do {
            System.out.println("Enter new standard:");
            standard = scanner.nextLine();
        } while (!Regex.checkName(standard));
        String areaPool;
        do {
            System.out.println("Enter new area pool:");
            areaPool = scanner.nextLine();
        } while (Double.parseDouble(areaPool) <= 30);
        String amountFloor;
        do {
            System.out.println("Enter new amount floor:");
            amountFloor = scanner.nextLine();
        } while (Integer.parseInt(amountFloor) > 0);
        Villa villa = new Villa(nameService, areaUses, costRent, amountPeople, typeRent, standard, areaPool, amountFloor);
        iVillaRepository.add(villa);
    }
}
