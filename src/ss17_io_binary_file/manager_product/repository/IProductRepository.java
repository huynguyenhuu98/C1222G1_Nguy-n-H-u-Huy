package ss17_io_binary_file.manager_product.repository;

import ss17_io_binary_file.manager_product.model.Product;

public interface IProductRepository {
    void add(Product product);
    void display();
    void search(String name);
}
