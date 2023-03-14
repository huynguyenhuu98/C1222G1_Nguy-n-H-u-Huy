package case_study_module2.model;

public abstract class Person {
    private String id;
    private String name;
    private String date;
    private String gender;
    private String idCard;
    private String numberPhone;
    private String email;

    public Person() {
    }

    public Person(String id, String name, String date, String gender, String idCard, String numberPhone, String email) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.gender = gender;
        this.idCard = idCard;
        this.numberPhone = numberPhone;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return  "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", gender='" + gender + '\'' +
                ", idCard='" + idCard + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", email='" + email + '\'' ;
    }
}
