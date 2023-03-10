package ss17_io_binary_file.manager_product.view;

import ss17_io_binary_file.manager_product.controller.ProductCotroller;

public class View {
    public static void main(String[] args) {
        ProductCotroller productCotroller = new ProductCotroller();
        productCotroller.menu();
    }
}
