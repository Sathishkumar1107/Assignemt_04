package com.java.Demos;

// AgeNotWithinRangeException class
class AgeNotWithinRangeException extends Exception{
    public AgeNotWithinRangeException(int age){
        super("Age " + age + " age is not within 15 to 21");
    }
}


// NameNotValidException class
class NameNotValidException extends Exception{
    public NameNotValidException(String name){
        super("Name " + name + " contains special characters so name is not valid");
    }
}

class Student{
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException{
        this.rollNo = rollNo;
        this.name = validateName(name);
        this.age = validateAge(age);
        this.course = course;
    }

    // here validating age

    private int validateAge(int age) throws AgeNotWithinRangeException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException(age);
        }
        return age;
    }

    // here validating name
    // Validate name
    private String validateName(String name) throws NameNotValidException {
        if (!name.matches("[a-zA-Z]+")) {
            throw new NameNotValidException(name);
        }
        return name;
    }

    @Override
    public String toString() {
        return "Student [Roll No: " + rollNo + ", Name: " + name + ", Age: " + age + ", Course: " + course + "]";
    }
}


public class managementSystem {
    public static void main(String[] args) {
        try{
            Student stud1 = new Student(1, "Sathish", 18, "Maths");
            System.out.println(stud1);

            Student stud2 = new Student(2, "Kumar", 22, "CS");
            System.out.println(stud2);
        } catch (AgeNotWithinRangeException | NameNotValidException e){
            System.out.println("Exception: " + e.getMessage());
        }

        try{
            Student stud3 = new Student(3, "Subramaniam123", 19, "Science");
            System.out.println(stud3);
        } catch (AgeNotWithinRangeException | NameNotValidException e){
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
