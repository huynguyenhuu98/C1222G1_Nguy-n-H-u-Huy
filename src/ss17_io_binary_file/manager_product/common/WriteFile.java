package ss17_io_binary_file.manager_product.common;

import ss17_io_binary_file.manager_product.model.Product;

import java.io.*;
import java.util.List;

public class WriteFile {
    public static void writeNewFile(String path, List<Product> products){
        ObjectOutputStream objectOutputStream= null;
        try {
            objectOutputStream= new ObjectOutputStream(new FileOutputStream(path,true));
            objectOutputStream.writeObject(products);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
