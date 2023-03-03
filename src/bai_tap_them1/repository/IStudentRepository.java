package bai_tap_them1.repository;

import bai_tap_them1.model.Students;

import java.util.List;

public interface IStudentRepository {
    List<Students> displayAll();

    boolean deleteById();

    void createStudent();

}
