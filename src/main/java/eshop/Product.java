package eshop;

public class Product {

    private int id = 0;
    private String name = null;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" + "id= " + id + ", name= " + name + "}";
    }

}
