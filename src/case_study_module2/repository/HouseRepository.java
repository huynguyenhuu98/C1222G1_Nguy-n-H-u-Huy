package case_study_module2.repository;

import case_study_module2.common.ReadFile;
import case_study_module2.common.WriteFile;
import case_study_module2.model.House;
import case_study_module2.repository.impl.IHouseRepository;

import java.util.ArrayList;
import java.util.List;

public class HouseRepository implements IHouseRepository {
    String file = "case_study_module2/data/house.csv";
    private static String toCSV(House house){
        return house.getNameService() +","+house.getAreaUse()+","+house.getCostRent()+","
                +house.getAmountPeople()+","+house.getTypeRent()+","+house.getStandardRoom()+","+house.getAmountFloor();
    }

    public List<House> display(){
        List<String> stringList = ReadFile.readFile(file);
        List<House> houses = new ArrayList<>();
        for (String str : stringList) {
            String[] temp = str.split(",");
            House house = new House(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6]);
            houses.add(house);
        }
        return houses;
    }
    public void add(House house) {
        String str = toCSV(house);
        List<String> stringList = new ArrayList<>();
        stringList.add(str);
        WriteFile.writeFile(file, stringList);
    }
}
