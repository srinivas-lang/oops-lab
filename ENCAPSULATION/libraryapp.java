class Book {

    private String title;
    private String author;
    private double price;
    private double rating;

   
    public Book(String title, String author, double price, double rating) {
        this.title = title;
        this.author = author;
        setPrice(price);   
        setRating(rating);
    }

    // Public getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

 
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price! Must be 0 or more.");
        }
    }

    public void setRating(double rating) {
        if (rating >= 0 && rating <= 5) {
            this.rating = rating;
        } else {
            System.out.println("Invalid rating! Must be between 0 and 5.");
        }
    }


    public void displayBook() {
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println("Price : $" + price);
        System.out.println("Rating: " + rating + " / 5");
    }
}
public class libraryapp {
    public static void main(String[] args) {
        Book book = new Book("The Alchemist", "Paulo Coelho", 350.0, 4.6);
        book.displayBook();

        System.out.println("\n--- Updating Book Details ---");
        book.setPrice(-100);     
        book.setRating(6);      
        book.setPrice(299.0);    
        book.setRating(4.9);    

        System.out.println("\n--- Updated Book Details ---");
        book.displayBook();
    }
}