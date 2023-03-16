package case_study_module2.repository.impl;

import case_study_module2.model.Villa;

import java.util.List;

public interface IVillaRepository {
    List<Villa> display();

    void add(Villa villa);
}
