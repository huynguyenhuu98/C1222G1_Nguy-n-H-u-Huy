package case_study_module2.repository;

import case_study_module2.model.Customer;
import case_study_module2.repository.impl.ICustomerRepository;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {

    public static final List<Customer> list = new ArrayList<>();
    static {
        list.add(new Customer("1001","Nguyễn Văn A","1/11/95","Nam",
                "206192671","0929862826","vana95@gmail.com","VIP","Đà Nẵng"));
        list.add(new Customer("1002","Nguyễn Văn B","08/01/99","Nam",
                "206192671","0911500914","vana95@gmail.com","GOLD","Đà Nẵng"));
        list.add(new Customer("1003","Nguyễn Thị C","22/11/98","Nữ",
                "206192671","0835443443","vana95@gmail.com","SILVER","Quảng Ngãi"));
    }
    @Override
    public List<Customer> display() {
        System.out.println(list);
        return list;
    }

    @Override
    public void add(Customer customer) {
        list.add(0,customer);
    }

}