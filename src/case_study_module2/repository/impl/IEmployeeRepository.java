package case_study_module2.repository.impl;

import case_study_module2.model.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> display();
    void add(Employee employee);

    void edit(Employee employee);
}
