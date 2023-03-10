package ss17_io_binary_file.manager_product.model;

import java.io.Serializable;

public class Product implements Serializable {
    private String id;
    private String name;
    private String price;
    private String producer;
    private String uses;

    public Product() {
    }

    public Product(String id, String name, String price, String producer, String uses) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.producer = producer;
        this.uses = uses;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getGoods() {
        return producer;
    }

    public String getDecrible() {
        return uses;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", goods='" + producer + '\'' +
                ", decrible='" + uses + '\'' +
                '}';
    }

    public String write() {
        return id +","+ name +"," + price + "," + producer + ","+ uses;
    }
}
