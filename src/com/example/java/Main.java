package com.example.java;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now(); // Getting the local date for today

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy"); //Formatting today's date

        String textToday = today.format(formatter);
        System.out.println("Today's date is: " + textToday); // printing today's date

        //Here are are going to get the month, day, and the year
        int myMonth = today.getMonthValue();
        int myDay = today.getDayOfMonth();
        int myYear = today.getYear();

        // Here is where we put it out together to get today's date again
        LocalDate todayDate = LocalDate.of(myYear,myMonth, myDay);

        System.out.println(todayDate);
        // Here we are declaring the date of the next full moon according to the website provided
        LocalDate nextFullMoon = LocalDate.of(2018, Month.MARCH, 1);// 3/14/2018

        Period p = Period.between(today, nextFullMoon); // Period of time between today and next full moon
        long p2 = ChronoUnit.DAYS.between(today, nextFullMoon); // Here we get the days in between how long from now

        System.out.println("The next full moon is on " + nextFullMoon); // Printing the date of next full moon

        //Printing everything together with how many days and months until the next full moon
        System.out.println("There are " + p.getMonths() + " months, and " + p2 + " days until the next full moon" );









    }
}
