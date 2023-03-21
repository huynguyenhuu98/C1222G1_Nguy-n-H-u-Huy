package case_study_module2.service;

import case_study_module2.common.Regex;
import case_study_module2.model.Customer;
import case_study_module2.repository.CustomerRepository;
import case_study_module2.repository.impl.ICustomerRepository;
import case_study_module2.service.impl.ICustomerService;

import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    ICustomerRepository iCustomerRepository = new CustomerRepository();
    Scanner scanner = new Scanner(System.in);

    public void display() {
        List<Customer> result = iCustomerRepository.display();
        System.out.println(result);
    }
    public void add() {
        System.out.println("Enter new id:");
        String id = scanner.nextLine();
        String name;
        do {
            System.out.println("Enter new name:");
            name = scanner.nextLine();
        } while (!Regex.checkNamePeople(name));
        System.out.println("Enter new date:");
        String date = scanner.nextLine();
        String gender;
        do {
            System.out.println("Enter new gender (Males/Females): ");
            gender = scanner.nextLine();
        } while (!gender.equals("Males") && !gender.equals("Females"));
        String idCard;
        do {
            System.out.println("Enter new idCard (9 numbers):");
            idCard = scanner.nextLine();
        } while (!Regex.checkIdCard(idCard));
        String numberPhone;
        do {
            System.out.println("Enter new numberPhone:");
            numberPhone = scanner.nextLine();
        } while (!Regex.checkPhoneNumber(numberPhone));
        String email;
        do {
            System.out.println("Enter new email:");
            email = scanner.nextLine();
        } while (!Regex.checkEmail(email));
        System.out.println("Enter new type customer:");
        String typeCustomer = scanner.nextLine();
        System.out.println("Enter new address:");
        String address = scanner.nextLine();
        Customer customer = new Customer(id,name,date,gender,idCard,numberPhone,email,typeCustomer,address);
        iCustomerRepository.add(customer);
    }
}
