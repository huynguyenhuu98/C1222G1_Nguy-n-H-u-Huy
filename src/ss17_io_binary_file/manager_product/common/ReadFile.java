package ss17_io_binary_file.manager_product.common;

import ss17_io_binary_file.manager_product.model.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static List<Product> readFile(String path) {
        List<Product> list = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            String temp = "";
            String[] tempArray;
            while ((temp = bufferedReader.readLine()) != null) {
                tempArray = temp.split(",");
                Product product = new Product(tempArray[0], tempArray[1], tempArray[2], tempArray[3], tempArray[4]);
                list.add(product);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
