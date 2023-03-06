package bai_tap_them1.repository;

import bai_tap_them1.model.Teacher;

import java.util.List;

public interface ITeacherRepository {
    List<Teacher> display();

    boolean delete();

    void create();
}
