package ss17_io_binary_file.manager_product.service;

import ss17_io_binary_file.manager_product.model.Product;
import ss17_io_binary_file.manager_product.repository.IProductRepository;
import ss17_io_binary_file.manager_product.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    IProductRepository iProductRepository = new ProductRepository();
    Scanner scanner = new Scanner(System.in);

    public void add() {
        List<Product> list = new ArrayList<>();
        System.out.println("Enter id of product: ");
        String id = scanner.nextLine();
        System.out.println("Enter name of product: ");
        String name = scanner.nextLine();
        System.out.println("Enter price of product: ");
        String price = scanner.nextLine();
        System.out.println("Enter goods of product: ");
        String goods = scanner.nextLine();
        System.out.println("Enter uses: ");
        String uses = scanner.nextLine();
        Product newProduct = new Product(id, name, price, goods, uses);
        iProductRepository.add(newProduct);
        System.out.println(list);
    }

    @Override
    public void display() {
        iProductRepository.display();
    }

    public void search() {
        System.out.println("Enter name product to search: ");
        String name = scanner.nextLine();
        iProductRepository.search(name);
    }
}