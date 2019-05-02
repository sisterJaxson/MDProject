package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    System.out.println("Monday's child is fair of face, ");
    System.out.println("Tuesday's child is full of grace, ");
    System.out.println("Wednesday's child is full of woe, ");
    System.out.println("Thursday's child is far to go. ");
    System.out.println("Friday's chile is loving and giving, ");
    System.out.println("Saturday's child works hard for a living, ");
    System.out.println("But the child born on the Sabbath Day, ");
    System.out.println("Is fair and good and wise in every way.");






    Scanner keyboard = new Scanner(System.in);
    }
    public static int userMonth2(int userMonth){
    switch (userMonth){
        case 1:
            return 13;
        case 2:
            return 14;
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        case 8:
        case 9:
        case 10:
        case 11:
        case 12:
            return (userMonth);
        default:
            return(0);

    }
    }

    public static int dayOfTheWeekMath(int userDay, int userMonth2, int userYear){
        userMonth2 = userMonth2(userMonth2);
        if (userMonth2>12){
            userYear==;
        }
        int A =(userYear%100);
        int B =(userYear/100);
        int dayOfTheWeekMath = (userDay+(13*(userMonth2+1))/5+A+(A/4)+(B/4)+(5*B));
        dayOfTheWeekMath %=7;
        return dayOfTheWeekMath;

    }

    public  static String dayOfTheWeek(int dayOfTheWeekMath){


       switch(dayOfTheWeekMath){
           case 0:
               return "Saturday";
           case 1:
               return"Sunday";
           case 2:
               return"Monday";
           case 3:
               return"Tuesday";
           case 4:
               return"Wednesday";
           case 5:
               return"Thursday";
           case 6:
               return"Friday";
           default:
               return "WARNING!";
       }

    }

    

    public static String giveMonth(int userMonth){
        switch(userMonth){
            case 1:
                return"January";
            case 2:
                return"February";
            case 3:
                return"March";
            case 4:
                return"April";
            case 5:
                return"May";
            case 6:
                return"June";
            case 7:
                return"July";
            case 8:
                return"August";
            case 9:
                return"September";
            case 10:
                return"October";
            case 11:
                return"November";
            case 12:
                return"December";
                default:
                    return"SKSK Wrong!";

        }


    }
    public static int daysOfTheMonth(int userMonth){
        switch (userMonth){
            case 1:
                return
            case 2:
                return
            case 3:
                return
            case 4:
                return
            case 5:
                return
            case 6:
                return
            case 7:
                return
            case 8:
                return
            case 9:
                return
            case 10:
                return
            case 11:
                return
            case 12:
                return 

        }
    }
}
