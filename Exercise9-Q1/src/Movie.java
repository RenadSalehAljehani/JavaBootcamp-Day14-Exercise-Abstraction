public class Movie extends Product{
    private String director;

    // Constructors
    public Movie(){
    }

    public Movie(String name, double price, String director) {
        super(name, price);
        this.director = director;
    }

    // Setters & getters

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    // Override the abstract method
    @Override
    public String getDiscount() {
        double discount = 5;
        return"Movies discount is: " + discount
                + "\nPrice for movie " + super.getName() + " after discount is: "
                + (super.getPrice()-discount);
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() // Override toString() method from the super class Product
                + "\nMovie director: " + director;
    }
}