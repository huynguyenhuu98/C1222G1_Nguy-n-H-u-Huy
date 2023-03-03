package bai_tap_them1.controller;

import bai_tap_them1.service.IStudentService;
import bai_tap_them1.service.StudentService;

import java.util.Scanner;

public class StudentController {
    Scanner scanner = new Scanner(System.in);

    public void menu() {
        int choice;
        IStudentService iStudentService = new StudentService();
        do {
            System.out.println("1: Add new function ");
            System.out.println("2: Delete teacher or student ");
            System.out.println("3: List teacher or student ");
            System.out.println("4: Exit");
            System.out.println("Re-enter");
            choice = Integer.parseInt(scanner.nextLine());
        } while (choice >= 1 && choice <= 4);
        switch (choice) {
            case 1:
                iStudentService.createStudent();
                break;
            case 2:
                iStudentService.deleteStudent();
                break;
            case 3:
                iStudentService.displayAll();
                break;
            case 4:
                break;
        }
    }
}
