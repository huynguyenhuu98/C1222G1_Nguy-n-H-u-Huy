package ss17_io_binary_file.manager_product.common;

import ss17_io_binary_file.manager_product.model.Product;

import java.io.*;
import java.util.List;

public class WriteFile {
    public static void writeFile(String file, Product product){
        BufferedWriter bufferedWriter=null;
        try {
            bufferedWriter= new BufferedWriter(new FileWriter(file,true));
            bufferedWriter.write(product.write());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
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
