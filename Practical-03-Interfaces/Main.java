interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class Printer {
    void powerOn() {
        System.out.println("Printer is switched ON");
    }
}

class AllInOnePrinter extends Printer implements Printable, Scannable {

    public void print() {
        System.out.println("Printing document...");
    }

    public void scan() {
        System.out.println("Scanning document...");
    }

    void display() {
        System.out.println("All-in-One Printer is ready");
    }
}

class Main {
    public static void main(String[] args) {

        AllInOnePrinter obj = new AllInOnePrinter();

        obj.powerOn();
        obj.display();
        obj.print();
        obj.scan();
    }
}
