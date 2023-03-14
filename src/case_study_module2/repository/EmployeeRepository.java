package case_study_module2.repository;

import case_study_module2.model.Employee;
import case_study_module2.repository.impl.IEmployeeRepository;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    public static final List<Employee> list = new ArrayList<>();
    static {
        list.add(new Employee("101","Nguyễn Văn A","1/11/95","Nam",
                "206192671","0929862826","vana95@gmail.com","University","Manager","25 triệu"));
        list.add(new Employee("102","Nguyễn Văn B","08/01/99","Nam",
                "206192671","0911500914","vana95@gmail.com","University","Director","30 triêu"));
        list.add(new Employee("103","Nguyễn Thị C","22/11/98","Nữ",
                "206192671","0835443443","vana95@gmail.com","University","Staff","18 triệu"));
    }
    @Override
    public List<Employee> display() {
        System.out.println(list);
        return list;
    }
    public void add(Employee employee){
        list.add(0,employee);
    }

    @Override
    public void edit(Employee employee) {

    }

    public void edit(List<Employee> list, int idEdit){
        for (int i = 0; i < list.size() ; i++) {
            if (i==idEdit) {
                list.add(new Employee());
                list.remove(idEdit);
                break;
            }
        }
    }
}
