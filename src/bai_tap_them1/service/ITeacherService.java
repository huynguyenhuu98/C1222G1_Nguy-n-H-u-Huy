package bai_tap_them1.service;

import bai_tap_them1.model.Teacher;

import java.util.List;

public interface ITeacherService {
    List<Teacher> display();

    boolean delete();

    void create();
}
