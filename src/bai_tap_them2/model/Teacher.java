package bai_tap_them2.model;

public class Teacher extends People {
    private String level;
    public Teacher() {
    }
    public Teacher(int id, String name, String dateOfBirth, Boolean gender, String level) {
        super(id, name, dateOfBirth, gender);
        this.level = level;
    }
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
