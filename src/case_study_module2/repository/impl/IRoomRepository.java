package case_study_module2.repository.impl;

import case_study_module2.model.Room;

import java.util.List;

public interface IRoomRepository {
    List<Room> display();

    void add(Room room);
}
