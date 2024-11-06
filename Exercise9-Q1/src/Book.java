public class Book extends Product{
    private String author;

    // Constructors
    public Book(){
    }

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    // Setters & getters

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Override the abstract method
    @Override
    public String getDiscount() {
        double discount = 10;
        return "Books discount is: " + discount
                + "\nPrice for book " + super.getName() + " after discount is: "
                + (super.getPrice()-discount);
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() // Override toString() method from the super class Product
                + "\nBook author: " + author;
    }
}