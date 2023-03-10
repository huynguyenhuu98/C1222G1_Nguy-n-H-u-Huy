package ss17_io_binary_file.manager_product.common;

import ss17_io_binary_file.manager_product.model.Product;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void writeFile(String file, Product product){
        BufferedWriter bufferedWriter=null;
        try {
            bufferedWriter= new BufferedWriter(new FileWriter(file,true));
            bufferedWriter.write(product.write());
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
