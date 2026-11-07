class Vehicle {

    String brand = "Toyota";

    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {

    String model = "Fortuner";

    void displayCar() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

class Person {

    String name = "Rahul";

    void displayPerson() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {

    int employeeId = 101;

    void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
    }
}

class Manager extends Employee {

    String department = "IT";

    void displayManager() {
        System.out.println("Department: " + department);
    }
}

class Shape {

    void display() {
        System.out.println("This is a Shape");
    }
}

class Circle extends Shape {

    double radius = 5;

    void calculateArea() {
        System.out.println("Circle Area: " + (3.14 * radius * radius));
    }
}

class Rectangle extends Shape {

    int length = 10;
    int width = 5;

    void calculateArea() {
        System.out.println("Rectangle Area: " + (length * width));
    }
}

class Inheritance {

    public static void main(String[] args) {

        System.out.println("SINGLE INHERITANCE");

        Car c = new Car();
        c.start();
        c.displayCar();

        System.out.println("\nMULTILEVEL INHERITANCE");

        Manager m = new Manager();
        m.displayPerson();
        m.displayEmployee();
        m.displayManager();

        System.out.println("\nHIERARCHICAL INHERITANCE");

        Circle cr = new Circle();
        cr.display();
        cr.calculateArea();

        Rectangle r = new Rectangle();
        r.display();
        r.calculateArea();
    }
}
