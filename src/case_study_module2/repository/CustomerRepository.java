package case_study_module2.repository;

import case_study_module2.common.ReadFile;
import case_study_module2.common.WriteFile;
import case_study_module2.model.Customer;
import case_study_module2.repository.impl.ICustomerRepository;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {

    String file = "case_study_module2/data/customer.csv";
    private static String toCSV(Customer customer) {
        return customer.getId() + "," + customer.getName() + "," + customer.getDate() + ","
                + customer.getGender() + "," + customer.getIdCard() + "," + customer.getNumberPhone() + ","
                + customer.getEmail() + "," + customer.getTypeCustomer() + "," + customer.getAddress();
    }

    @Override
    public List<Customer> display() {
        List<String> stringList = ReadFile.readFile(file);
        List<Customer> customers = new ArrayList<>();
        for (String str : stringList) {
            String[] temp = str.split(",");
            Customer customer = new Customer(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8]);
            customers.add(customer);
        }
        return customers;
    }

    public void add(Customer customer) {
        String str = toCSV(customer);
        List<String> stringList = new ArrayList<>();
        stringList.add(str);
        WriteFile.writeFile(file, stringList);
    }
}