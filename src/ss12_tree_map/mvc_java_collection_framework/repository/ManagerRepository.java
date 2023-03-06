package ss12_tree_map.mvc_java_collection_framework.repository;

import ss12_tree_map.mvc_java_collection_framework.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ManagerRepository implements IManagerRepository {

    static List<Product> list = new ArrayList<>();

    static {
        list.add(new Product("1001", "Mer C200", 1.4));
        list.add(new Product("1002", "Mer C300", 2));
        list.add(new Product("1003", "Mer E300", 2.5));
        list.add(new Product("1004", "Mer S450", 5));
    }

    @Override
    public void add(Product newProduct) {
        list.add(newProduct);
        System.out.println("Add success");
    }

    @Override
    public void edit(String id) {
        list.contains(id);
    }

    @Override
    public void delete(String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                list.remove(list.get(i));
                return;
            }
        }
        System.out.println("Do have this id !");
    }

    @Override
    public void display() {
        for (Product product : list) {
            System.out.println(product.toString());
        }
    }

    @Override
    public void search(String name) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)) {
                System.out.println("Product: " + list.get(i).getName() + ", Location: " + (i + 1));
                break;
            }
        }
    }

    @Override
    public void arrange(byte choice) {
        switch (choice) {
            case 1:
                list.sort((o1, o2) -> (int) (o1.getPrice() - o2.getPrice()));
                for (Product product : list) {
                    System.out.println(product.toString());
                }
                break;
            case 2:
                list.sort((o1, o2) -> (int) (o2.getPrice() - o1.getPrice()));
                for (Product product : list) {
                    System.out.println(product.toString());
                }
                break;
        }
    }
}

