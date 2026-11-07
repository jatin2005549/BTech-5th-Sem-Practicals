class Student {

    String name;

    Student(String n) {
        name = n;
        System.out.println(name + " object is created");
    }

    void display() {
        System.out.println("Student Name: " + name);
    }

    @Override
    protected void finalize() {
        System.out.println(name + " object is garbage collected");
    }
}

class Main {

    public static void main(String[] args) {

        Student s1 = new Student("Rahul");
        Student s2 = new Student("Aman");

        System.out.println("\nUsing Objects:");

        s1.display();
        s2.display();

        System.out.println("\nRemoving Object References:");

        s1 = null;
        s2 = null;

        System.out.println("Object references removed");

        System.out.println("\nRequesting Garbage Collection:");

        System.gc();

        System.out.println("Garbage collection requested");
    }
}
