package case_study_module2.repository.impl;

import case_study_module2.model.House;

import java.util.List;

public interface IHouseRepository {
    List<House> display();

    void add(House house);
}
