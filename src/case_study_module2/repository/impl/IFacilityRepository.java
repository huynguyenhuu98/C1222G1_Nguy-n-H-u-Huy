package case_study_module2.repository.impl;

import case_study_module2.model.Facility;

import java.util.List;

public interface IFacilityRepository {
    List<Facility> display();
    void add(Facility facility);
}
