
class Book {
    private String title;
    private String author;
    private int yearPublished;
    private double price;

    public Book(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Title: \"" + title + "\"\n" +
               "Author: \"" + author + "\"\n" +
               "Year Published: " + yearPublished + "\n" +
               "Price: $" + price;
    }
}

public class Task11 {
    public static void main(String[] args) {
        // Create 3 book objects
        Book b1 = new Book("Java Programming", "John Smith", 2021, 39.99);
        Book b2 = new Book("Python Basics", "Jane Doe", 2020, 29.99);
        Book b3 = new Book("C++ Essentials", "Michael Johnson", 2019, 49.99);

        // Print details
        System.out.println("Book 1:\n" + b1 + "\n");
        System.out.println("Book 2:\n" + b2 + "\n");
        System.out.println("Book 3:\n" + b3 + "\n");
    }
}
