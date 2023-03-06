package ss12_tree_map.mvc_java_collection_framework.service;

public interface IManagerService {
    void add();
    void edit();
    void delete(String id);
    void display();

    void search(String name);
    void arrange(byte choice);
}
