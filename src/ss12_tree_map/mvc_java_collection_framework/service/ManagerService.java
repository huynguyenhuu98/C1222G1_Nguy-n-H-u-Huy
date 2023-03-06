package ss12_tree_map.mvc_java_collection_framework.service;

import ss12_tree_map.mvc_java_collection_framework.model.Product;
import ss12_tree_map.mvc_java_collection_framework.repository.IManagerRepository;
import ss12_tree_map.mvc_java_collection_framework.repository.ManagerRepository;

import java.util.*;


public class ManagerService implements IManagerService {
    private final IManagerRepository managerRepository = new ManagerRepository();
    Scanner scanner = new Scanner(System.in);
    static List<Product> list = new ArrayList<>();

    @Override
    public void add() {
        System.out.println("Enter id of product new: ");
        String id = scanner.nextLine();
        System.out.println("Enter name of product new: ");
        String name = scanner.nextLine();
        System.out.println("Enter price of product new: ");
        double price = Double.parseDouble(scanner.nextLine());
        Product newProduct = new Product(id, name, price);
        managerRepository.add(newProduct);
    }

    @Override
    public void edit() {
        System.out.print("Enter id product want edit: ");
        String id = scanner.nextLine();
        for (Product product : list) {
            if (id.equals(product.getId())) {
                System.out.print("Enter name product again: ");
                product.setName(scanner.nextLine());
                System.out.print("Enter price again: ");
                product.setPrice(Double.parseDouble(scanner.nextLine()));
                return;
            }
        }
        managerRepository.edit(id);
        System.out.println("Id not exist");
    }

    @Override
    public void delete(String id) {
        managerRepository.delete(id);
    }

    @Override
    public void display() {
        managerRepository.display();
    }


    @Override
    public void search(String name) {
        managerRepository.search(name);
    }

    @Override
    public void arrange(byte choice) {
        managerRepository.arrange(choice);
    }
}
