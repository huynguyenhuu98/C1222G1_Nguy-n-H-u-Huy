package case_study_module2.model;

public class Customer extends Person {
    private String typeCustomer;
    private String address;

    public Customer() {
    }
    public Customer(String id, String name, String date, String gender,
                    String idCard, String numberPhone, String email, String typeCustomer, String address) {
        super(id, name, date, gender, idCard, numberPhone, email);
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() +
                "typeCustomer='" + typeCustomer + '\'' +
                ", address='" + address + '\'' +
                 '}'+"\n";
    }
}
