package bai_tap_them_truyen.model;

public class Truyen {
    private int id;
    private String name;
    private String date;
    private String producer;

    public Truyen() {
    }

    public Truyen(int id, String name, String date, String producer) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.producer = producer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Truyen{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", producer='" + producer + '\'' +
                '}';
    }
}
