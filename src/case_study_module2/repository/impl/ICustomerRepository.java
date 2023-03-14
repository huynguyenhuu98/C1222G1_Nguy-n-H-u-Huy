package case_study_module2.repository.impl;

import case_study_module2.model.Customer;

import java.util.List;

public interface ICustomerRepository {

    List<Customer> display();

    void add(Customer customer);
}
