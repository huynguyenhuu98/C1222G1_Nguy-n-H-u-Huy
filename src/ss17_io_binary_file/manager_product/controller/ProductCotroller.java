package ss17_io_binary_file.manager_product.controller;

import ss17_io_binary_file.manager_product.service.IProductService;
import ss17_io_binary_file.manager_product.service.ProductService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductCotroller {

    public static List<ProductCotroller> readDataToFile(String file) {
        List<ProductCotroller> products = new ArrayList<>();
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);
            products = (List<ProductCotroller>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return products;
    }

    public static void writeDataToFile(String file, List<ProductCotroller> product) {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream(file, true);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void menu() {
        Scanner input = new Scanner(System.in);
        List<ProductCotroller> list = new ArrayList<>();
        IProductService iProductService = new ProductService();
        int choice;
        do {
            System.out.println("1. Display product");
            System.out.println("2. Add new product");
            System.out.println("3. Search product");
            System.out.println("4. Exit");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    iProductService.display();
                    writeDataToFile("ss17_io_binary_file/manager_product/data/product.txt", list);
                    break;
                case 2:
//                    iProductService.add();
                    break;
                case 3:
//                    iProductService.search();
                    break;
                case 4:
                    return;
            }
        } while (true);
    }
}
