package com.java.Demos;
import java.util.HashMap;
import java.util.Scanner;

class StudentGrades{
    private HashMap<String, Integer> studentMap;

    public StudentGrades() {
        studentMap = new HashMap<>();
    }

    public void addStudent(String name, int grade) {
        studentMap.put(name, grade);
        System.out.println("Student " + name + " added with grade " + grade + ".");
    }

    public void removeStudent(String name) {
        if (studentMap.containsKey(name)) {
            studentMap.remove(name);
            System.out.println("Student " + name + " removed.");
        } else {
            System.out.println("Student " + name + " not found.");
        }
    }

    public void displayGrade(String name) {
        if (studentMap.containsKey(name)) {
            System.out.println("The grade for " + name + " is: " + studentMap.get(name));
        } else {
            System.out.println("Student " + name + " not found.");
        }
    }
}
public class HashmapExample {
    public static void main(String[] args) {
        StudentGrades studentGrades = new StudentGrades();
        Scanner obj = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Grade");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = obj.nextInt();
            obj.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = obj.nextLine();
                    System.out.print("Enter grade: ");
                    int grade = obj.nextInt();
                    studentGrades.addStudent(name, grade);
                    break;

                case 2:
                    System.out.print("Enter student name to remove: ");
                    name = obj.nextLine();
                    studentGrades.removeStudent(name);
                    break;

                case 3:
                    System.out.print("Enter student name to display grade: ");
                    name = obj.nextLine();
                    studentGrades.displayGrade(name);
                    break;

                case 4:
                    System.out.println("Exiting program.");
                    obj.close();
                    return;

            }
        }


    }
}
