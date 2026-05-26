package REP09.REP09_03;
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
    double salary;
    Employee() {
    }

    Employee(String name, String ssn, double salary) {
        super(name);
        this.ssn = ssn;
        this.salary = salary;
    }

    //output메서드 추가!
    void output(double averageSal) {
        System.out.println("Name: " + name);
        System.out.println("SSN: " + ssn);
        System.out.println("Salary: " + salary);
        if (salary >= averageSal) {
            System.out.println("Salary above average");
        } else {
            System.out.println("Salary below average");
        }
    }
}

class SSNLengthException extends Exception {
    SSNLengthException(String ssn) {
        super("SSN Error: '" + ssn + "' is not 8 characters long.");
    }
}

public class Rep09Employee3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Employee[] employees = new Employee[10];

        System.out.print("How many employees? (max 10): ");
        int count = Integer.parseInt(s.nextLine());

        for (int i = 0; i < count; i++) {
            System.out.println("");
            System.out.println("Entering data for employee " + (i + 1));

            System.out.print("Enter name: ");
            String name = s.nextLine();

            String ssn = "";
            while (true) {
                System.out.print("Enter SSN (no dashes or spaces): ");
                ssn = s.nextLine();
                try {
                    if (ssn.length() != 8) throw new SSNLengthException(ssn);
                    break;
                } catch (SSNLengthException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Please enter agin.");
                }
            }
            double  salary = 0;
            while (true) {
                System.out.print("Enter salary: ");
                try {
                    salary = Integer.parseInt(s.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Salary Error: A non-numeric value was entered.");
                    System.out.println("Please enter again.");
                }
            }
            employees[i] = new Employee(name, ssn, salary);
        }

        double total = 0;
        for (int i = 0; i <count; i++) {
            total += employees[i].salary;
        }
        double average = total / count;

        System.out.println("===== Employee List and Salary Evaluation ====");
        for(int i = 0; i < count; i++) {
            System.out.println("");
            System.out.println("Employee  #" + (i + 1));
            employees[i].output(average);
        }

    }
}