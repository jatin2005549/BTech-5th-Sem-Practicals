class Employee {

    String employeeName;
    double salary;

    static int employeeCount = 0;

    Employee() {
        this("Unknown", 0.0);
    }

    Employee(String employeeName, double salary) {
        this.employeeName = employeeName;
        this.salary = salary;
        employeeCount++;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: " + salary);
        System.out.println("----------------------");
    }

    static void displayEmployeeCount() {
        System.out.println("Total Employees: " + employeeCount);
    }
}

class Main {

    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee("Rahul", 25000);
        Employee e3 = new Employee("Amit", 30000);

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();

        Employee.displayEmployeeCount();
    }
}
