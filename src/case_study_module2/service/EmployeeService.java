package case_study_module2.service;

import case_study_module2.model.Employee;
import case_study_module2.repository.EmployeeRepository;
import case_study_module2.repository.impl.IEmployeeRepository;
import case_study_module2.service.impl.IEmployeeService;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    IEmployeeRepository iEmployeeRepository = new EmployeeRepository();
    Scanner scanner = new Scanner(System.in);

    public void display() {
        List<Employee> result = iEmployeeRepository.display();
        System.out.println(result);
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
        System.out.println("Enter new level:");
        String level = scanner.nextLine();
        System.out.println("Enter new position:");
        String position = scanner.nextLine();
        System.out.println("Enter new salary:");
        String salary = scanner.nextLine();
        Employee employee = new Employee(id,name,date,gender,idCard,numberPhone,email,level,position,salary);
        iEmployeeRepository.add(employee);
    }
//    public void edit(){
//        System.out.println("Enter id edit:");
//        String idEdit = scanner.nextLine();
//        System.out.println("Enter new id:");
//        String id = scanner.nextLine();
//        System.out.println("Enter new name:");
//        String name = scanner.nextLine();
//        System.out.println("Enter new date:");
//        String date = scanner.nextLine();
//        System.out.println("Enter new gender:");
//        String gender = scanner.nextLine();
//        System.out.println("Enter new idCard:");
//        String idCard = scanner.nextLine();
//        System.out.println("Enter new numberPhone:");
//        String numberPhone = scanner.nextLine();
//        System.out.println("Enter new email:");
//        String email = scanner.nextLine();
//        System.out.println("Enter new level:");
//        String level = scanner.nextLine();
//        System.out.println("Enter new position:");
//        String position = scanner.nextLine();
//        System.out.println("Enter new salary:");
//        String salary = scanner.nextLine();
//        Employee employee = new Employee(id,name,date,gender,idCard,numberPhone,email,level,position,salary);
//        iEmployeeRepository.edit(String.valueOf(employee));
//        iEmployeeRepository.edit(idEdit);
//    }
}