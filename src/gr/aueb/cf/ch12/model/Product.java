package gr.aueb.cf.ch12.model;

public class Product {
    private long id;
    private String name;
    private String descriptionl;
    private double price;
    private int quantity;
    private boolean inStock;

    public Product() {


    }

    public Product(long id, String name, String descriptionl, double price, int quantity, boolean inStock) {
        this.id = id;
        this.name = name;
        this.descriptionl = descriptionl;
        this.price = price;
        this.quantity = quantity;
        this.inStock = inStock;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescriptionl() {
        return descriptionl;
    }

    public void setDescriptionl(String descriptionl) {
        this.descriptionl = descriptionl;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
}
