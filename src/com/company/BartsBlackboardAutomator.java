package com.company;
import java.util.Scanner;

public class BartsBlackboardAutomator
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        String message;
        // whenever Bart Simpson gets in trouble he has to write something
        // on the blackboard. Now he can use this program to do it for him.
        // Leaving him more time for trouble!
        System.out.println( "Type in your message, "
                + "Bart, and I'll display it one hundred times." );
        System.out.print( "Message: " );
        message = keyboard.nextLine();

        //Array numbering starts with zero. But we're using a for loop
        //so we can set the start point and end point to anything we want.
        for ( int n = 1 ; n <= 100 ; n++ )
        {
            //The counter variable, n, is within scope inside the loop
            //but not accessible outside the loop
            //What does the \t do? What happens if you remove it?
            System.out.println( n + ".\t" + message );
        }
        // Note: n is not visible outside the for loop in which it was declared
        // Uncomment the following line to see if this is true
        // System.out.println("value of n = " + n);



    }
}