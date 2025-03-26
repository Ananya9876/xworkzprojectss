package com.xworkz.Encapsulation;

    class Employee {
        static String companyName;  // Static variable
        int empId;
        String empName;

        // Static block: executes only once when the class is loaded
        static {
            System.out.println("Static block executed!");
            companyName = "Tech Corp";
        }

        // Constructor
        public Employee(int empId, String empName) {
            this.empId = empId;
            this.empName = empName;
        }

        // Method to display employee details
        void display() {
            System.out.println("Employee ID: " + empId + ", Name: " + empName + ", Company: " + companyName);
        }
    }

    // Main class
    public class Block {
        public static void main(String[] args) {
            Employee e1 = new Employee(101, "Alice");
            Employee e2 = new Employee(102, "Bob");

            e1.display();
            e2.display();
        }
    }

}
