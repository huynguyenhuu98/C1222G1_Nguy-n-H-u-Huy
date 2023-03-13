package ss17_io_binary_file.manager_product.view;

import ss17_io_binary_file.manager_product.controller.ProductController;

public class View {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        productController.menu();
    }
}
