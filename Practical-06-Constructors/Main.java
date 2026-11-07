class Book {

    String title;
    String author;
    double price;

    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    Book(Book obj) {
        title = obj.title;
        author = obj.author;
        price = obj.price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("----------------------");
    }
}

class Main {

    public static void main(String[] args) {

        System.out.println("DEFAULT CONSTRUCTOR");

        Book b1 = new Book();
        b1.display();

        System.out.println("PARAMETERIZED CONSTRUCTOR");

        Book b2 = new Book("Java Programming", "James Gosling", 500);
        b2.display();

        System.out.println("COPY CONSTRUCTOR");

        Book b3 = new Book(b2);
        b3.display();

        System.out.println("MODIFYING COPIED OBJECT");

        b3.title = "Advanced Java";
        b3.price = 700;

        System.out.println("Original Object:");
        b2.display();

        System.out.println("Copied Object:");
        b3.display();
    }
}
