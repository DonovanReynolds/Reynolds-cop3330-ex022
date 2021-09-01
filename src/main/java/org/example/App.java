package org.example;

import java.util.Scanner;
/*
 *   UCF COP 3330 Fall 2021 Assignment 22 Solution
 *   Copyright 2021 Donovan Reynolds
 */
public class App 
{
    public static void main( String[] args )
    {
        int num1 = stringToInt("Enter the first number:");
        int num2 = stringToInt("Enter the second number:");
        int num3 = stringToInt("Enter the third number:");

        int[] numbers = new int[]{num1, num2, num3};
        int biggest = 0;

        if (num1 == num2 || num2 == num3 || num1 == num3)
        {
            System.exit(0);
        }

        for (int number : numbers) {
            if (number > biggest) {
                biggest = number;
            }
        }
        System.out.println("The longest number is " + biggest);

    }

    public static String inputOutput(String textToSay)
    {
        Scanner input = new Scanner(System.in);
        System.out.println(textToSay);
        return input.nextLine();
    }

    public static int stringToInt(String error)
    {
        int temp = 0;
        boolean check = false;
        while(!check)
        {
            String text = inputOutput(error);
            try
            {
                temp = Integer.parseInt(text);
                check = true;
            }
            catch(NumberFormatException e)
            {
                System.out.println("You entered a value that is not a number. Please try again.");


            }
        }
        return temp;
    }

    public static double stringToDouble (String error)
    {
        double temp = 0.0;
        boolean check = false;
        while(!check)
        {
            String text = inputOutput(error);
            try
            {
                temp = Double.parseDouble(text);
                check = true;
            }
            catch(NumberFormatException e)
            {
                System.out.println("You entered a value that is not a number. Please try again.");

            }
        }
        return temp;
    }
}
