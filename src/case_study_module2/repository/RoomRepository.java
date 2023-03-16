package case_study_module2.repository;

import case_study_module2.common.ReadFile;
import case_study_module2.common.WriteFile;
import case_study_module2.model.Room;
import case_study_module2.repository.impl.IRoomRepository;

import java.util.ArrayList;
import java.util.List;

public class RoomRepository implements IRoomRepository {
    String file = "case_study_module2/data/room.csv";
    private static String toCSV(Room room){
        return room.getNameService() +","+room.getAreaUse()+","+room.getCostRent()+","
                +room.getAmountPeople()+","+room.getTypeRent()+","+room.getFreeService();
    }

    public List<Room> display(){
        List<String> stringList = ReadFile.readFile(file);
        List<Room> houses = new ArrayList<>();
        for (String str : stringList) {
            String[] temp = str.split(",");
            Room room = new Room(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5]);
            houses.add(room);
        }
        return houses;
    }
    public void add(Room room) {
        String str = toCSV(room);
        List<String> stringList = new ArrayList<>();
        stringList.add(str);
        WriteFile.writeFile(file, stringList);
    }
}
