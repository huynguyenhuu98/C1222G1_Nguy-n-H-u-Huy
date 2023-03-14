package ss17_io_binary_file.manager_product.repository;

import ss17_io_binary_file.manager_product.model.Product;

import java.util.List;

public interface IProductRepository {
    void addProduct(List<Product> product);
    List<Product> display();
    void search(String name);
}
