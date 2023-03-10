package ss17_io_binary_file.manager_product.service;

import ss17_io_binary_file.manager_product.repository.ProductRepository;

public class ProductService implements IProductService{
    ProductRepository productRepo= new ProductRepository();
    @Override
    public void display() {
        productRepo.display();
    }
}