// File: Main.java

package mypackage;

import java.util.Scanner;

// Class 1
class Student {
    int rollNo;
    String name;
    int mark1, mark2, mark3;

    void getDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Mark 1: ");
        mark1 = sc.nextInt();

        System.out.print("Enter Mark 2: ");
        mark2 = sc.nextInt();

        System.out.print("Enter Mark 3: ");
        mark3 = sc.nextInt();
    }

    void displayDetails() {
        System.out.println("\n----- Student Details -----");
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Mark 3: " + mark3);
    }
}

// Class 2
class Result {
    int total;
    double average;

    void calculate(int a, int b, int c) {
        total = a + b + c;
        average = total / 3.0;
    }

    void displayResult() {
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);

        if (average >= 90) {
            System.out.println("Grade: A+");
        } else if (average >= 80) {
            System.out.println("Grade: A");
        } else if (average >= 70) {
            System.out.println("Grade: B");
        } else if (average >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        Student s = new Student();
        Result r = new Result();

        System.out.println("STUDENT MANAGEMENT SYSTEM");

        s.getDetails();

        s.displayDetails();

        r.calculate(s.mark1, s.mark2, s.mark3);

        System.out.println("\n----- Student Result -----");

        r.displayResult();

        System.out.println("\nProgram Completed Successfully!");
    }
}
