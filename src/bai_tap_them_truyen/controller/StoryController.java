package bai_tap_them_truyen.controller;

import bai_tap_them_truyen.repository.IStoryRepository;
import bai_tap_them_truyen.repository.StoryRepository;
import bai_tap_them_truyen.service.IStoryService;
import bai_tap_them_truyen.service.StoryService;

import java.util.Scanner;

public class StoryController {
    Scanner scanner = new Scanner(System.in);

    public void menu() {
        int choice;
        IStoryRepository iStoryRepository = new StoryRepository();
        IStoryService iStoryService = new StoryService();
        do {
            System.out.println("1: Display ");

            System.out.println("4: Exit");

            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iStoryService.display();
                    break;
                case 4:
                    return;
            }
        } while (true);
    }
}
