package bai_tap_them1.repository;

import bai_tap_them1.model.Students;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private static final List<Students> studentList = new ArrayList<>();
    static {
        studentList.add(new Students(101,"Huy","01/11/1998",true,"C12",8.6));
        studentList.add(new Students(102,"Hồng","01/11/1997",false,"C12",7.9));
        studentList.add(new Students(103,"Huệ","01/11/1996",null,"C12",6.8));
    }
    @Override
    public List<Students> display() {
        return studentList;
    }

    public boolean delete() {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId()) {
                studentList.remove(i);
            }
        }
        return false;
    }

    @Override
    public void create() {
        studentList.add(1,new Students());
    }
}
