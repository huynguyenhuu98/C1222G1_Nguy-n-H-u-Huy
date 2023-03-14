package ss17_io_binary_file.manager_product.repository;

import ss17_io_binary_file.manager_product.common.ReadFile;
import ss17_io_binary_file.manager_product.common.WriteFile;
import ss17_io_binary_file.manager_product.model.Product;

import java.util.List;

public class ProductRepository implements IProductRepository {
    public static String fileBinary = "ss17_io_binary_file/manager_product/data/binary.txt";

    public void addProduct (List<Product> product) {
        WriteFile.writeNewFile(fileBinary, product);
    }

    @Override
    public List<Product> display() {
        return ReadFile.readFile(fileBinary);
    }

    public void search(String name) {
        List<Product> product = ReadFile.readFile(fileBinary);
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
