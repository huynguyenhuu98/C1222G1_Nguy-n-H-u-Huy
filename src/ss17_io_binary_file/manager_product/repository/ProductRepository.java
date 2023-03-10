package ss17_io_binary_file.manager_product.repository;

import ss17_io_binary_file.manager_product.common.ReadFile;
import ss17_io_binary_file.manager_product.model.Product;

import java.util.List;

public class ProductRepository implements IProductRepository{
    public static String file="ss17_io_binary_file/manager_product/data/product.txt";
    @Override
    public void display() {
        List<Product> productList= ReadFile.read(file);
        for (Product p: productList){
            System.out.println(p.toString());
        }
    }
}
