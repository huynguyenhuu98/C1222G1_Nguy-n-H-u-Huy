package bai_tap_them1.controller;

import bai_tap_them1.service.IStudentService;
import bai_tap_them1.service.ITeacherService;
import bai_tap_them1.service.StudentService;
import bai_tap_them1.service.TeacherService;

import java.util.Scanner;

public class StudentController {
    Scanner scanner = new Scanner(System.in);

    public void menu() {
        int choice;
        IStudentService iStudentService = new StudentService();
        ITeacherService iTeacherService = new TeacherService();
        do {
            System.out.println("1: Add new function student ");
            System.out.println("2: Delete a student ");
            System.out.println("3: List student ");
            System.out.println("4: Add new function teacher ");
            System.out.println("5: Delete a teacher ");
            System.out.println("6: List teacher ");
            System.out.println("7: Exit");
            System.out.println("Re-enter");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iStudentService.create();
                    break;
                case 2:
                    iStudentService.delete();
                    break;
                case 3:
                    iStudentService.display();
                    break;
                case 4:
                    iTeacherService.create();
                    break;
                case 5:
                    iTeacherService.delete();
                    break;
                case 6:
                    iTeacherService.display();
                    break;
                case 7:
                    break;
            }
        } while (choice >= 1 && choice <= 7);

    }
}
