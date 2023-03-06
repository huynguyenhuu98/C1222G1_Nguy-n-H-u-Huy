package bai_tap_them1.service;

import bai_tap_them1.model.Students;

import java.util.List;

public interface IStudentService {

    List<Students> display();

    boolean delete();

    void create();
}
