class Product {

    String productName;
    double price;
    int quantity;

    Product() {
        productName = "Unknown";
        price = 0.0;
        quantity = 0;
    }

    Product(String name) {
        productName = name;
        price = 0.0;
        quantity = 0;
    }

    Product(String name, double p) {
        productName = name;
        price = p;
        quantity = 0;
    }

    Product(String name, double p, int q) {
        productName = name;
        price = p;
        quantity = q;
    }

    double calculateTotalCost() {
        return price * quantity;
    }

    void displayDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + calculateTotalCost());
        System.out.println("--------------------------");
    }
}

class Main {

    public static void main(String[] args) {

        System.out.println("NO-ARGUMENT CONSTRUCTOR");

        Product p1 = new Product();
        p1.displayDetails();

        System.out.println("ONE-PARAMETER CONSTRUCTOR");

        Product p2 = new Product("Laptop");
        p2.displayDetails();

        System.out.println("TWO-PARAMETER CONSTRUCTOR");

        Product p3 = new Product("Mobile", 15000);
        p3.displayDetails();

        System.out.println("THREE-PARAMETER CONSTRUCTOR");

        Product p4 = new Product("Keyboard", 1000, 3);
        p4.displayDetails();
    }
}
