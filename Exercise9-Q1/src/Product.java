public abstract class Product {
    private String name;
    private double price;

    // Constructors
    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Setters & getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Abstract method
    public abstract String  getDiscount();

    // toString method
    @Override
    public String toString() {
        return "\nName: " + name
                + "\nPrice: " + price;
    }
}