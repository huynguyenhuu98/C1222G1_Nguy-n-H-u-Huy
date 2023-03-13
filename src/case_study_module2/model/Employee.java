package case_study_module2.model;

public class Employee extends Person{
    private String level;
    private String position;
    private String salary;

    public Employee() {
    }

    public Employee(String id, String name, String date, String gender, String idCard,
                    String numberPhone, String email, String level, String position, String salary) {
        super(id, name, date, gender, idCard, numberPhone, email);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
