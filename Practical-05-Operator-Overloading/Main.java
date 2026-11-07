class ComplexNumber {

    int real;
    int imaginary;

    ComplexNumber(int r, int i) {
        real = r;
        imaginary = i;
    }

    ComplexNumber add(ComplexNumber obj) {

        int newReal = real + obj.real;
        int newImaginary = imaginary + obj.imaginary;

        return new ComplexNumber(newReal, newImaginary);
    }

    void display() {
        System.out.println(real + " + " + imaginary + "i");
    }
}

class Main {

    public static void main(String[] args) {

        ComplexNumber c1 = new ComplexNumber(5, 3);
        ComplexNumber c2 = new ComplexNumber(2, 4);

        System.out.println("First Complex Number:");
        c1.display();

        System.out.println("Second Complex Number:");
        c2.display();

        ComplexNumber result = c1.add(c2);

        System.out.println("Addition Result:");
        result.display();
    }
}
