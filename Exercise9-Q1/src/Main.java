public class Main {
    public static void main(String[] args) {
        //--------------- Book Class Test---------------
        // 1. Create Book objects
        Book book1 = new Book("Emotional intelligence Book",20.0,"Sara Maher");

        Book book2 = new Book();

        book2.setName("Brainstorming for Beginners Book");
        book2.setPrice(15.5);
        book2.setAuthor("Ali Sami");

        // 2. Print info
        // Book1 using toString
        System.out.println("--------------- First Book ---------------" + book1.toString()
                + "\n" + book1.getDiscount());

        // Book2 using getters
        System.out.println("--------------- Second Book ---------------"
                + "\nName: " + book2.getName()
                + "\nPrice: " + book2.getPrice()
                + "\nBook author: " + book2.getAuthor()
                + "\n" +  book2.getDiscount());

        //----------------------------------------------------------------------------------------------
        System.out.println("------------------------------------------------------------------");
        //--------------- Movie Class Test---------------
        // 1. Create Movie objects
        Movie movie1 = new Movie("Split Movie",10.2,"M. Night Shyamalan");

        Movie movie2 = new Movie();

        movie2.setName("Titanic Movie");
        movie2.setPrice(13.7);
        movie2.setDirector("James Cameron");

        // 2. Print info
        // Movie1 using toString
        System.out.println("--------------- First Movie ---------------" + movie1.toString()
                + "\n" + movie1.getDiscount());

        // Movie2 using getters
        System.out.println("--------------- Second Movie ---------------"
                + "\nName: " + movie2.getName()
                + "\nPrice: " + movie2.getPrice()
                + "\nMovie director: " + movie2.getDirector()
                + "\n" +  movie2.getDiscount());
    }
}