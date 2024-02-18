/**
 * Imagine you are creating a simple program to represent a book. Create a Java class named 'Book' with the following
 * attributed: 'title', 'author' and 'numberOfPages'. Include a constructor that takes them to attributes. In your main
 * program, create an instance of the 'Book' class and display the detail of the 5 Book
 */

public class Book {
    String title;
    String author;
    int numberOfPages;

    // Constructor
    public Book(String title, String author, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Number of Pages: " + this.numberOfPages);
    }

    public static void main(String[] args) {
        // Create an instance of Book
        Book book1 = new Book("Title1", "Author1", 200);
        Book book2 = new Book("Title2", "Author2", 300);
        Book book3 = new Book("Title3", "Author3", 250);
        Book book4 = new Book("Title4", "Author4", 350);
        Book book5 = new Book("Title5", "Author5", 150);

        // Display the details of the Book
        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();
        book4.displayDetails();
        book5.displayDetails();
    }
}
