class Student {

    int rollNo;
    String name;
    int marks1, marks2, marks3;

    Student(int r, String n, int m1, int m2, int m3) {
        rollNo = r;
        name = n;
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
    }

    int calculateTotal() {
        return marks1 + marks2 + marks3;
    }

    double calculateAverage() {
        return calculateTotal() / 3.0;
    }

    double calculatePercentage() {
        return (calculateTotal() / 300.0) * 100;
    }

    void displayDetails() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks 1: " + marks1);
        System.out.println("Marks 2: " + marks2);
        System.out.println("Marks 3: " + marks3);
        System.out.println("Total: " + calculateTotal());
        System.out.println("Average: " + calculateAverage());
        System.out.println("Percentage: " + calculatePercentage());
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {

        Student s1 = new Student(101, "Rahul", 80, 75, 90);
        Student s2 = new Student(102, "Aman", 70, 85, 80);
        Student s3 = new Student(103, "Rohit", 90, 95, 85);

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}
