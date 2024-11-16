package com.java.Demos;

import java.util.Scanner;

public class weekDays {
    public static void main(String[] args) {
        String [] weekdays = {"sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"};
        Scanner obj = new Scanner(System.in);
        try{
            System.out.println("Enter the day position from 0 to 6");
            int dayIndex = obj.nextInt();
            System.out.println("The day is : 6" + weekdays[dayIndex]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("please enter a valid index value");
        } catch (Exception e){
            System.out.println("please enter a valid day value");
        } finally {
            obj.close();
        }
    }
}
