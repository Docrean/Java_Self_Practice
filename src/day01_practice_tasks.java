public class day01_practice_tasks {

    public static void main(String[] args) {

        System.out.println("Hello");
        System.out.println("World");

        System.out.println("-------------------------------");

        System.out.print("Hello");
        System.out.print("World");
        System.out.println(); //append new line after last System.out.print statement
        System.out.println("-------------------------------");

        System.out.print("Hello ");
        System.out.println("Cydeo");
        System.out.print("I love ");
        System.out.println("Programming.");

        System.out.println("-----------------------------");

        System.err.println("doogies:");
        System.err.println("; expected");

        //This is the way

        /*
        This is the way
        to multi-line comment
         */

        /*
        \n Newline Moves the cursor to the next line for subsequent printing
        \t Horizontal Tab Moves the cursor to skip over to the next tab stop
        \\ Backslash Causes a backslash to be printed
        \" Double quote Causes a double quotation mark to be printed
        \' Single quote Causes a single quotation mark to be printed (used in char data type)
        \b Backspace Moves the cursor to back up, or move left, one position
        \r Return Moves the cursor to the beginning of the current line, not the next line
         */

        //coffee
        String slash = "\\__/";
        String word = "Hello";
        String coffee ="\'coffee\'";
        String tea ="\'tea\'";

        //stairs
        System.out.println(slash);
        System.out.println("He said " + word + ".");
        System.out.println("Would you like " + coffee + " or " + tea + "?");


        System.out.println("*****\n\t*****\n\t\t*****\n\t\t\t*****\n\t\t\t\t*****");

        //BuildOnce

        System.out.println();

    }
}