package ss17_io_binary_file.manager_product.common;

import ss17_io_binary_file.manager_product.model.Product;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static List<Product> readFile(String path) {
        List<Product> list = new ArrayList<>();
        ObjectInputStream objectInputStream;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(path));
            list = (List<Product>) objectInputStream.readObject();
        }   catch (EOFException e){
            WriteFile.writeNewFile(path, list);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                objectInputStream = new ObjectInputStream(new FileInputStream(path));
                list = (List<Product>) objectInputStream.readObject();
                objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        return list;
    }
}
