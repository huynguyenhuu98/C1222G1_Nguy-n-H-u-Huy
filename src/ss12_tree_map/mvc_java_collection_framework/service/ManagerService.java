package ss12_tree_map.mvc_java_collection_framework.service;

import ss12_tree_map.mvc_java_collection_framework.repository.IManagerRepository;
import ss12_tree_map.mvc_java_collection_framework.repository.ManagerRepository;

public class ManagerService implements IManagerService {
    private final IManagerRepository managerRepository = new ManagerRepository();

    @Override
    public void add() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void display() {
        managerRepository.display();
    }

    @Override
    public void search() {

    }

    @Override
    public void arrange() {

    }
}
