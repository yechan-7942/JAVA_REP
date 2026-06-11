package REP09.REP09_01;

import java.util.Scanner;

class Person {
    String name;
    Person() {}
    Person(String name) {
        this.name = name;
    }
}

class Employee extends Person {
    String ssn;
    int salary;
    Employee() {}
    Employee(String name, String ssn, int salary) {
        super(name);
        this.ssn = ssn;
        this.salary = salary;
    }
}

public class Rep09employee1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Employee[] employees = new Employee[10];

        System.out.print("How many employees? (max 10): ");
        int count = Integer.parseInt(s.nextLine());

        for (int i = 0; i < count; i++) {
            System.out.println("\nEntering data for employee " + (i +1));

            System.out.print("Enter name: ");
            String name = s.nextLine();

            System.out.print("Enter SSN (no dashes or spaces): ");
            String ssn = s.nextLine();

            System.out.print("Enter salary:");
            int salary = Integer.parseInt(s.nextLine());

            employees[i] = new Employee(name,ssn,salary);
        }
    }
}