package case_study_module2.controllers;

import case_study_module2.service.CustomerService;
import case_study_module2.service.EmployeeService;
import case_study_module2.service.impl.ICustomerService;
import case_study_module2.service.impl.IEmployeeService;

import java.util.Scanner;

public class FuramaController {
    Scanner scanner = new Scanner(System.in);

    public void displayMainMenu() {
        ICustomerService iCustomerService = new CustomerService();
        IEmployeeService iEmployeeService = new EmployeeService();
        int choice1;
        do {
            System.out.println("1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tPromotion Management\n" +
                    "5.\tExit\n");
            choice1 = Integer.parseInt(scanner.nextLine());
            switch (choice1) {
                case 1:
                int choice2;
                loop1:
                do {
                    System.out.println("1\tDisplay list employees\n" +
                            "2\tAdd new employee\n" +
                            "3\tEdit employee\n" +
                            "4\tReturn main menu\n");
                    choice2 = Integer.parseInt(scanner.nextLine());
                    switch (choice2) {
                        case 1:
                            iEmployeeService.display();
                            break;
                        case 2:
                            iEmployeeService.add();
                            break;
                        case 3:
                            iEmployeeService.edit();
                            break;
                        case 4:
                            break loop1;
                    }
                } while (choice2 >= 1 && choice2 <= 4);
                break;
                case 2:
                    int choice3;
                    loop2:
                    do {
                        System.out.println("1.\tDisplay list customers\n" +
                                "2.\tAdd new customer\n" +
                                "3.\tEdit customer\n" +
                                "4.\tReturn main menu\n");
                        choice3 = Integer.parseInt(scanner.nextLine());
                        switch (choice3) {
                            case 1:
                                iCustomerService.display();
                                break;
                            case 2:
                                iCustomerService.add();
                            case 3:
                            case 4:
                                break loop2;
                        }
                    } while (choice3 >= 1 && choice3 <= 4);
                    break;
                case 3:
                    System.out.println("1\tDisplay list facility\n" +
                            "2\tAdd new facility\n" +
                            "3\tDisplay list facility maintenance\n" +
                            "4\tReturn main menu\n");
                    break;
                case 4:
                    System.out.println("1.\tDisplay list customers use service\n" +
                            "2.\tDisplay list customers get voucher\n" +
                            "3.\tReturn main menu\n");
                    break;
                case 5:
                    System.exit(0);
            }
        } while (choice1 <= 5 && choice1 >= 1);
    }
}
