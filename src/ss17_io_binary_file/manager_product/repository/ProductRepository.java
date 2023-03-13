package ss17_io_binary_file.manager_product.repository;

import ss17_io_binary_file.manager_product.common.ReadFile;
import ss17_io_binary_file.manager_product.common.WriteFile;
import ss17_io_binary_file.manager_product.model.Product;

import java.util.List;

public class ProductRepository implements IProductRepository {
    public static String file = "ss17_io_binary_file/manager_product/data/product.txt";
    public static String fileBinary = "ss17_io_binary_file/manager_product/data/binary.txt";

    public void add(Product product) {
        List<Product> products = ReadFile.readFile(file);
        products.add(product);

        WriteFile.writeFile(file, product);
        WriteFile.writeNewFile(fileBinary, products);
    }

    @Override
    public void display() {
        List<Product> productList = ReadFile.readFile(file);
        for (Product product : productList) {
            System.out.println(product.toString());
        }
    }

    public void search(String name) {
        List<Product> product = ReadFile.readFile(file);
        for (Product value : product) {
            if (value.getName().equals(name)) {
                System.out.println("Product: "
                        + value.getName()
                        + "Describe: " + value.getUses());
            } else {
                System.out.println("does not exist !!!");
            }
        }
    }
}
