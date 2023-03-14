package case_study_module2.service;

import case_study_module2.model.Customer;
import case_study_module2.repository.CustomerRepository;
import case_study_module2.repository.impl.ICustomerRepository;
import case_study_module2.service.impl.ICustomerService;

import java.util.Scanner;

public class CustomerService implements ICustomerService {
    ICustomerRepository iCustomerRepository = new CustomerRepository();
    Scanner scanner = new Scanner(System.in);

    public void display() {
        iCustomerRepository.display();
    }
    public void add() {
        System.out.println("Enter new id:");
        String id = scanner.nextLine();
        System.out.println("Enter new name:");
        String name = scanner.nextLine();
        System.out.println("Enter new date:");
        String date = scanner.nextLine();
        System.out.println("Enter new gender:");
        String gender = scanner.nextLine();
        System.out.println("Enter new idCard:");
        String idCard = scanner.nextLine();
        System.out.println("Enter new numberPhone:");
        String numberPhone = scanner.nextLine();
        System.out.println("Enter new email:");
        String email = scanner.nextLine();
        System.out.println("Enter new type customer:");
        String typeCustomer = scanner.nextLine();
        System.out.println("Enter new addres:");
        String address = scanner.nextLine();

        Customer customer = new Customer(id,name,date,gender,idCard,numberPhone,email,typeCustomer,address);
        iCustomerRepository.add(customer);
    }
}
