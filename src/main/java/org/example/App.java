package org.example;

import java.util.Calendar;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Colton Flynn
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner Obj = new Scanner(System.in);
        int year = Calendar.getInstance().get(Calendar.YEAR);

        System.out.print( "What is your current age? ");
        int age = Integer.parseInt(Obj.nextLine());

        System.out.print( "At what age would you like to retire? ");
        int retireAge = Integer.parseInt(Obj.nextLine());

        int yearsLeft = retireAge-age;
        int retireYear = year + yearsLeft;

        System.out.println("You have "+yearsLeft+" years left until you can retire.");
        System.out.println("It's "+year+", so you can retire in "+retireYear+".");
    }
}