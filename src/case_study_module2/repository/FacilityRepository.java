package case_study_module2.repository;

import case_study_module2.common.ReadFile;
import case_study_module2.common.WriteFile;
import case_study_module2.model.Facility;
import case_study_module2.repository.impl.IFacilityRepository;

import java.util.ArrayList;
import java.util.List;

public class FacilityRepository implements IFacilityRepository {
    String file = "case_study_module2/data/facility.csv";
    private static String toCSV(Facility facility){
        return facility.getNameService() +","+facility.getAreaUse()+","+facility.getCostRent()+","
                +facility.getAmountPeople()+","+facility.getTypeRent();
    }

    public List<Facility> display(){
        List<String> stringList = ReadFile.readFile(file);
        List<Facility> facilities = new ArrayList<>();
        for (String str : stringList) {
            String[] temp = str.split(",");
            Facility facility = new Facility(temp[0], temp[1], temp[2], temp[3], temp[4]);
            facilities.add(facility);
        }
        return facilities;
    }
    public void add(Facility facility) {
        String str = toCSV(facility);
        List<String> stringList = new ArrayList<>();
        stringList.add(str);
        WriteFile.writeFile(file, stringList);
    }
}
