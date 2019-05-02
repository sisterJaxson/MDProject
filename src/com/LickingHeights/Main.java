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


    public static int dayOfTheWeekMath(int userDay, int userMonth, int userYear){
        userMonth = userMonth(userMonth);
        if (userMonth>12){
            userYear==;
        }
        int A =(userYear%100);
        int B =(userYear/100);
        int dayOfTheWeekMath = (userDay+(13*(userMonth+1))/5+A+(A/4)+(B/4)+(5*B));
        dayOfTheWeekMath %=7;
        return dayOfTheWeekMath;

    }

    public  static String dayOfTheWeek(int dayOfTheWeekMath){


       switch(dayOfTheWeekMath){
           case 0:
               System.out.println("Saturday");
               break;
           case 1:
               System.out.println("Sunday");
               break;
           case 2:
               System.out.println("Monday");
               break;
           case 3:
               System.out.println("Tuesday");
               break;
           case 4:
               System.out.println("Wednesday");
               break;
           case 5:
               System.out.println("Thursday");
               break;
           case 6:
               System.out.println("Friday");
               break;
           default:
               return ("WARNING!");
       }

    }

    

    static void poemLine(){

    }
}
