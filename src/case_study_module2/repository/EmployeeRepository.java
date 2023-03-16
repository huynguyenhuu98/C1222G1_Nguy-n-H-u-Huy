package case_study_module2.repository;

import case_study_module2.common.ReadFile;
import case_study_module2.common.WriteFile;
import case_study_module2.model.Employee;
import case_study_module2.repository.impl.IEmployeeRepository;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    String file = "case_study_module2/data/employee.csv";

    private static String toCSV(Employee employee) {
        return employee.getId() + "," + employee.getName() + "," + employee.getDate() + ","
                + employee.getGender() + "," + employee.getIdCard() + "," + employee.getNumberPhone() + ","
                + employee.getEmail() + "," + employee.getLevel() + "," + employee.getPosition() + "," + employee.getSalary();
    }

    @Override
    public List<Employee> display() {
        List<String> stringList = ReadFile.readFile(file);
        List<Employee> employees = new ArrayList<>();
        for (String str : stringList) {
            String[] temp = str.split(",");
            Employee employee = new Employee(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8], temp[9]);
            employees.add(employee);
        }
        return employees;
    }

    public void add(Employee employee) {
        String str = toCSV(employee);
        List<String> stringList = new ArrayList<>();
        stringList.add(str);
        WriteFile.writeFile(file, stringList);
    }

//    @Override
//    public void edit(String id) {
//        List<Employee> list = new ArrayList<>();
//        for (Employee employee : list){
//            if (employee.equals(id)) {
//                list.remove(id);
//                list.add(new Employee());
//                break;
//            }
//        }
//    }
}
