package bai_tap_them1.model;

public class Teacher extends People {
    private String regular;

    public Teacher() {
    }

    public Teacher(int id, String name, String dateOfBirth, Boolean gender, String regular) {
        super(id, name, dateOfBirth, gender);
        this.regular = regular;
    }

    public String getRegular() {
        return regular;
    }

    public void setRegular(String regular) {
        this.regular = regular;
    }
}
