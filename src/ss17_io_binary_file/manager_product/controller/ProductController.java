package ss17_io_binary_file.manager_product.controller;

import ss17_io_binary_file.manager_product.service.IProductService;
import ss17_io_binary_file.manager_product.service.ProductService;

import java.util.Scanner;

public class ProductController {

    public void menu() {
        Scanner input = new Scanner(System.in);
        IProductService iProductService = new ProductService();
        int choice;
        do {
            System.out.println("1. Add new product");
            System.out.println("2. Display product");
            System.out.println("3. Search product");
            System.out.println("4. Exit");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    iProductService.add();
                    break;
                case 2:
                    iProductService.display();
                    break;
                case 3:
                    iProductService.search();
                    break;
                case 4:
                    return;
            }
        } while (true);
    }
}
