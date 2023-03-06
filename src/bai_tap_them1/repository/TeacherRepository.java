package bai_tap_them1.repository;

import bai_tap_them1.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepository implements ITeacherRepository {
    private static final List<Teacher> teacherList = new ArrayList<>();
    static {
        teacherList.add(new Teacher(1001,"Hoang","01/11/1992",true,"dai hoc"));
        teacherList.add(new Teacher(1002,"Hung","01/11/1991",false,"cao dang"));
        teacherList.add(new Teacher(1003,"Huu","01/11/1990",null,"dai hoc"));
    }
    @Override
    public List<Teacher> display() {
        return teacherList;
    }

    public boolean delete() {
        for (int i = 0; i < teacherList.size(); i++) {
            if (teacherList.get(i).getId()) {
                teacherList.remove(i);
            }
        }
        return false;
    }

    @Override
    public void create() {
        teacherList.add(1,new Teacher());
    }
}
