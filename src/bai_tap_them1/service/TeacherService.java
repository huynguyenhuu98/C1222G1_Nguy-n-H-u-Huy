package bai_tap_them1.service;

import bai_tap_them1.model.Students;
import bai_tap_them1.repository.ITeacherRepository;
import bai_tap_them1.repository.TeacherRepository;
import bai_tap_them1.model.Teacher;

import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    Scanner scanner = new Scanner(System.in);
    ITeacherRepository iTeacherRepository = new TeacherRepository();
    @Override
    public List<Teacher> display() {
        List<Teacher> list = iTeacherRepository.display();
        if (list.size() == 0) {
            System.out.println("No one learn !");
        } else {
            for (Teacher temp : list) {
                System.out.println(temp);
            }
        }
        return list;
    }

    @Override
    public boolean delete() {
        System.out.println("Enter id delete: ");
        int id = Integer.parseInt(scanner.nextLine());
        if (iTeacherRepository.delete()) {
            System.out.println("Delete success");
        } else {
            System.out.println("Do not find object to delete");
        }
        return false;
    }

    @Override
    public void create() {
        System.out.println("Enter id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter date of birth: ");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Enter gender: ");
        String tempGender = scanner.nextLine();
        Boolean gender;
        if (tempGender.equals("Males")) {
            gender = true;
        } else if (tempGender.equals("Females")) {
            gender = false;
        } else {
            gender = null;
        }
        System.out.println("Enter name class: ");
        String nameClass = scanner.nextLine();
        System.out.println("Enter point: ");
        double point = scanner.nextDouble();
        Students student = new Students(id, name, dateOfBirth, gender, nameClass, point);
        iTeacherRepository.create();
        System.out.println("Add success");
    }
}
