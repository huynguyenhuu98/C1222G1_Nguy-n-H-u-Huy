package ss12_tree_map.mvc_java_collection_framework.repository;

import ss12_tree_map.mvc_java_collection_framework.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ManagerRepository implements IManagerRepository {
    static List<Product> list = new ArrayList<>();
    static {
        list.add(new Product("1001","Mer C200","1.4 tỷ"));
        list.add(new Product("1002","Mer C300","2 tỷ"));
        list.add(new Product("1003","Mer E300","2.5 tỷ"));
        list.add(new Product("1003","Mer S450","5 tỷ"));
    }

    @Override
    public void add() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void display() {
        for(Product product : list){
            System.out.println(product.toString());
        }
    }

    @Override
    public void search() {

    }

    @Override
    public void arrange() {

    }
}
