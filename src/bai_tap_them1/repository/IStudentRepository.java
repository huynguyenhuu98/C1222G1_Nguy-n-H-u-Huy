package bai_tap_them1.repository;

import bai_tap_them1.model.Students;

import java.util.List;

public interface IStudentRepository {

    boolean delete();

    void create();

    List<Students> display();
}
