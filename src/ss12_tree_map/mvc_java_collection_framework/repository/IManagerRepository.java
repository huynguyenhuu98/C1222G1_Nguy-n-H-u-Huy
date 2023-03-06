package ss12_tree_map.mvc_java_collection_framework.repository;

import ss12_tree_map.mvc_java_collection_framework.model.Product;

public interface IManagerRepository {
    void add(Product newProduct);

    void edit(String id);

    void delete(String id);
    void display();
    void search(String name);

    void arrange(byte choice);
}
