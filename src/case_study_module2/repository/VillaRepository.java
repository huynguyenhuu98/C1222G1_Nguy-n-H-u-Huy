package case_study_module2.repository;

import case_study_module2.common.ReadFile;
import case_study_module2.common.WriteFile;
import case_study_module2.model.Villa;
import case_study_module2.repository.impl.IVillaRepository;

import java.util.ArrayList;
import java.util.List;

public class VillaRepository implements IVillaRepository {
    String file = "case_study_module2/data/facility.csv";
    private static String toCSV(Villa villa){
        return villa.getNameService() +","+villa.getAreaUse()+","+villa.getCostRent()+","
                +villa.getAmountPeople()+","+villa.getTypeRent()+","+villa.getStandard()+","+villa.getAreaPool()+","+villa.getAmountFloor();
    }

    public List<Villa> display(){
        List<String> stringList = ReadFile.readFile(file);
        List<Villa> villas = new ArrayList<>();
        for (String str : stringList) {
            String[] temp = str.split(",");
            Villa villa = new Villa(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7]);
            villas.add(villa);
        }
        return villas;
    }
    public void add(Villa villa) {
        String str = toCSV(villa);
        List<String> stringList = new ArrayList<>();
        stringList.add(str);
        WriteFile.writeFile(file, stringList);
    }
}
