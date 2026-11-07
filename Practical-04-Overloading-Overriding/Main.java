class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    double add(double a, int b) {
        return a + b;
    }
}

class Payment {

    void calculatePay() {
        System.out.println("Calculating basic payment");
    }
}

class UPIPayment extends Payment {

    @Override
    void calculatePay() {
        System.out.println("Calculating UPI payment");
    }
}

class Main {

    public static void main(String[] args) {

        System.out.println("METHOD OVERLOADING");

        Calculator obj = new Calculator();

        System.out.println("Addition of 2 integers: " + obj.add(10, 20));

        System.out.println("Addition of 3 integers: " + obj.add(10, 20, 30));

        System.out.println("Addition of 2 doubles: " + obj.add(10.5, 20.5));

        System.out.println("Addition of double and integer: " + obj.add(10.5, 20));

        System.out.println("\nMETHOD OVERRIDING");

        Payment p = new Payment();
        p.calculatePay();

        Payment p1 = new UPIPayment();
        p1.calculatePay();
    }
}
