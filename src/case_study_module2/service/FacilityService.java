package case_study_module2.service;

import case_study_module2.model.Facility;
import case_study_module2.repository.FacilityRepository;
import case_study_module2.repository.impl.IFacilityRepository;
import case_study_module2.service.impl.IFacilityService;

import java.util.List;

public class FacilityService implements IFacilityService {
    IFacilityRepository iFacilityRepository = new FacilityRepository();
    public void display() {
        List<Facility> result = iFacilityRepository.display();
        System.out.println(result);
    }
}
