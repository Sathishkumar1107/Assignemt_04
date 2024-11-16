package com.java.Demos;

class InvalidVoterAgeException extends Exception {
    public InvalidVoterAgeException() {
        super("Invalid age for voter");
    }
}

class voter{
    int voterId;
    String name;
    int age;

    public voter(int voterId, String name, int age) throws InvalidVoterAgeException{
        this.voterId = voterId;
        this.name = name;
        this.age = validateAge(age);
    }

    //validate age here

    private int validateAge(int age) throws InvalidVoterAgeException {
       if (age < 18){
           throw new InvalidVoterAgeException();
       }
       return age;
    }

    @Override
    public String toString() {
        return "Voter [Voter ID: " + voterId + ", Name: " + name + ", Age: " + age + "]";
    }


}
public class VoterId {
    public static void main(String[] args) {
       try{
           voter v1 = new voter(123, "Sathish", 20);
           System.out.println(v1);

           voter v2 = new voter(124, "Kumar", 17);
           System.out.println(v2);

       } catch (InvalidVoterAgeException e){
           System.out.println("Exception: " + e.getMessage());
       }
    }
}
