package day04_practice_tasks;

import javax.swing.*;
import java.sql.SQLOutput;

public class day04_practice_tasks {

    public static void main(String[] args) {

        //ConcatIntro

        String name = "Brandon"; //---------------------------------
        // |
        int age = 35;                                            // |
        // |                                             // |
        int salary = 85_000;                                     // |
        //|     // |                                             // |
        //|     // |                                             // \/
        System.out.println("Hello " + name + ","); //declare first dataType (String name)
        //|     // |        //order-->
        //|     // |        //string-->variable-->string-->variable-->string
        //|     // |        //variables are passed OUTSIDE the " "
        //|     // |        //strings are passed INSIDE the " "
        //|     // |
        System.out.println("You are " + age + " years old."); //declare second dataType (age)
        //|     // |---------------------------------------------/\
        //|
        System.out.println("Your Salary is " + salary + " USD");
        //|-------------------/\ //declare third dataType Salary
        // ANY VALUE CAN BE LINKED TO A STRING AFTER EACH STRING

        int number = 10_000_000;

        System.out.println("soutv auto concat number is " + number);
        //string concat's the variable AUTOMATICALLY using SOUTV

        System.out.println("---------------------------------------------------------------- ");

        //Birthday

        /*
        Create a class called BirthDay and create the following variables:

             name, birthDay(int), birthMonth(String), birthYear(int)

             use concatenation to display the birthday of the person
                 if  name = "Brandon"
                     birthDay = 09
                     birthMonth = "May"
                     birthYear = 1988;
                 output:
                     Brandon was born on 05/09/1988.
           */

        String name1 = "Brandon";
        int birthDay = 9, birthMonth = 5,
                birthYear = 1988;

        System.out.println(name1 + " was born on " + birthMonth + "/"
                + birthDay + "/" + birthYear);

        System.out.println("--------------------------------------------------------");

        //CarInfo

        /*
Car information is :
        2018 Toyota Camry, 50000 miles, Red, $19000.
1. Create a class named CarInfo.java
2. Declare the following variables:
        1. year
        2. make
        3. model
        4. miles
        5. color
        6. Price
3. Use concatenation to print the full info of the car in the
following format:
Year Make Model, Miles, Color, Price.
        Ex:
 */

        String make = "Toyota",
                model = "Camry",
                color = "Red";


        int year = 2018, //these values are outside the range of byte...so cast byte into the value.
                miles = 50000,
                Price = 19000;

        System.out.println(year + " " + make + " " + model
                + ", " + miles + " miles, " + color + ", $" + Price + ".");

        System.out.println("----------------------------------------------------------------");

        //Circle

        /*
        Create a class named Circle and declare the following variables:
                radius
                area
                perimeter
        Write a program that can calculate the area and perimeter of a circle with any given radius
            Ex:
                  radius = 5
            output:
                   Area of the circle is 78.5
                   Perimeter of the circle is 31.4
        */

        double radius = 5;

        double area = radius * radius * 3.14,
                perimeter = radius * 2 * 3.14;

        System.out.println("Area of the Circle is " + area);
        System.out.println("Perimeter of the circle is " + perimeter);

        System.out.println("----------------------------------------------------");

        //Selection Statements

        //if statements

        /*
        If statement checks a condition (boolean-expression).
        If the condition is true, the code block under if is executed.
        If the condition is false, the code follows its sequential order.
        If there are multiple single if statements, zero or any combination of them can be executed.

        if(condition){
             statements
        }

        For a single statement, curly braces can be omitted but not recommended.

        if(condition) statement;

         */

        if (4 < 5) System.out.println(true); //true. if statement prints.

        int age2 = 43;
        if (age2 >= 21) System.out.println("Eligible"); //prints the true
        else System.out.println("Not Eligible");

        int i = 4;
        if (5 > 2) {
            i = --i + 6; //first decrements value of i then adds 6
            System.out.println(i);
        }

        System.out.println("----------------------------------------------------");


        int m = 8;


        if (m < 10) System.out.println("i < 10");
        if (m < 9) System.out.println("i < 9");
        if (m < 8) System.out.println("i < 8");
        if (m < 7) System.out.println("i < 7");
        if (m < 6) System.out.println("i < 6");

        /*
        i < 10
        i < 9
         */

        System.out.println("----------------------------------------------------");

        int u = 3;

        if (u < 10) System.out.println("i < 10");
        if (u < 9) System.out.println("i < 9");
        if (u < 8) System.out.println("i < 8");
        if (u < 7) System.out.println("i < 7");
        if (u < 6) System.out.println("i < 6");

        /*
        i < 10
        i < 9
        i < 8
        i < 7
        i < 6

         */

        System.out.println("----------------------------------------------------");

        int s = 11;

        if (s < 10) System.out.println("i < 10");
        if (s < 9) System.out.println("i < 9");
        if (s < 8) System.out.println("i < 8");
        if (s < 7) System.out.println("i < 7");
        if (s < 6) System.out.println("i < 6");


        /*

         */


        System.out.println("----------------------------------------------------");

        /*
        Write a program to calculate weekly wage for a given working hours.
        A company’s normal weekly wage is $900. It is multiplied by 1.5 if an
        employee’s working hours is greater than 40.
         */

        int workingHours = 60;
        int weeklyWage = 900;

        if (workingHours > 40) {
            System.out.println(weeklyWage * 1.5);
        }

        //or

        int workingHours1 = 60;
        double weeklyWage1 = 900D; //weekly wage reassigned as decimal

        if (workingHours1 > 40) {
            weeklyWage1 = weeklyWage1 * 1.5;
        }

        System.out.println("Weekly wage: " + weeklyWage1);

        System.out.println("----------------------------------------------------");


        int number1 = 19;
        boolean isEnough = false;

        if (number1 >= 20) { //false. if statement prints only true. won't print
            System.out.println("I have more than 20 watermelons");
        }
        if (isEnough) { //declared isEnough is false. won't run.
            System.out.println("Good Job");
        }
        if (!isEnough) { //the reverse of isEnough declared is true. if statement prints true.
            System.out.println("I need more watermelon");
        }

        System.out.println("----------------------------------------------------");


        //If else (2 way double selection)
        /*
        If statement checks a condition (boolean-expression).
        If the condition is true, code block under “if” is executed.
        If the condition is false, code block under “else” is executed.
        One of the two statements is executed.
         */

        /*
        if(condition){
            statement
        } else{
            statement
        }
         */

        int birthYear1 = 2015;
        int birthYear2 = 2005;
        if (birthYear1 < 2024) {
            System.out.println("True");
            ;
        } else {
            System.out.println("False");
        }

        if (birthYear2 > 2024) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        System.out.println("----------------------------------------------------");

        int g = 8;

        if (g < 10) System.out.println("g < 10");
        else if (g < 9) System.out.println("g < 9");
        else if (g < 8) System.out.println("g < 8");
        else if (g < 7) System.out.println("g < 7");
        else if (g < 6) System.out.println("g < 6");

        System.out.println("----------------------------------------------------");

        int l = 3;

        if (l < 10) System.out.println("l < 10");
        else if (l < 9) System.out.println("l < 9");
        else if (l < 8) System.out.println("l < 8");
        else if (l < 7) System.out.println("l < 7");
        else if (l < 6) System.out.println("l < 6");

        System.out.println("----------------------------------------------------");

        int n = 11;

        if (n < 10) System.out.println("n < 10");
        else if (n < 9) System.out.println("n < 9");
        else if (n < 8) System.out.println("n < 8");
        else if (n < 7) System.out.println("n < 7");
        else if (n < 6) System.out.println("n < 6");


        System.out.println("----------------------------------------------------");


        //Multi-branch "if" (if-else if-else)

        /*
        Multi-branch “if” (“if - else if - else”) allows us to perform different actions based on multiple conditions.

        We can use “else if” condition more than once.

        If there are multiple conditions, only one of them is executed.

        */

        int f = 5;
        int a = 6;

        if (f == a) {
            System.out.println("Mcgoo"); //false. won't run
        } else if (a == f) {
            System.out.println("Mcgee"); //false. won't run
        } else { //(no condition)
            System.out.println("Invalid"); //else runs if conditions are false
        }

        /*
        Write a program that checks the value of the variable num.
        If num is greater than 0, the program prints "Number is positive".
        If num is less than 0, the program prints "Number is negative".
        If num is neither greater than nor less than 0 (i.e., it is 0), the
        program prints "Number is zero".
         */

        int num = 0;

        if (num > 0) {
            System.out.println("Number is positive");
        } else if (num > 0) {
            System.out.println("Number is zero");
        } else {
            System.out.println("Number is zero");
        }

        int num1 = 3;

        if (num1 > 0) {
            System.out.println("Number is positive");
        } else if (num1 < 0) {
            System.out.println("Number is zero");
        } else {
            System.out.println("Number is zero");
        }


        System.out.println("----------------------------------------------------");

        int e = 8;

        if (e < 10) System.out.println("e < 10");
        else if (e < 9) System.out.println("e < 9");
        else if (e < 8) System.out.println("e < 8");
        else if (e < 7) System.out.println("e < 7");
        else if (e < 6) System.out.println("e < 6");
        else System.out.println("none");

        System.out.println("----------------------------------------------------");

        int w = 3;

        if (w < 10) System.out.println("w < 10");
        else if (w < 9) System.out.println("w < 9");
        else if (w < 8) System.out.println("w < 8");
        else if (w < 7) System.out.println("w < 7");
        else if (w < 6) System.out.println("w < 6");
        else System.out.println("none");


        System.out.println("----------------------------------------------------");

        int z = 11;

        if (z < 10) System.out.println("z < 10");
        else if (z < 9) System.out.println("z < 9");
        else if (z < 8) System.out.println("z < 8");
        else if (z < 7) System.out.println("z < 7");
        else if (z < 6) System.out.println("z < 6");
        else System.out.println("none");


        System.out.println("----------------------------------------------------");


        /*

        Single-if
            If there are multiple single if statements, zero or any combination of them can be executed.

        if(condition){
            statements
        }



        if-else:
            One of the two statements is executed.

        if(condition){
            statement
        } else{
            statement
        }



        Multi-branch if:
        "if-else if-else"
            If there are multiple conditions, only one of them is executed.

        if(condition){
            statement
        } else if (condition){
            statement
        } else{   <-----------------NO CONDITION IN THE ELSE BLOCK
            statement
        }


         */


        //Greatest Number

        int num2 = 4, num3 = 8;


        if (num2 > num3) {
            System.out.println("The greatest number is " + num2);
        } else if (num3 > num2) {
            System.out.println("The greatest number is " + num3);
        }

        System.out.println("----------------------------------------------------");

        //Greeting Hours
        /*
        Write a program that prints greeting words for a given hour with 24-hour clock system.
        If an hour is after 6 but before 12 noon, greet with Good Morning
        If an hour is after 12 noon but before 15, greet with Good Afternoon
        If an hour is after 15 but before 22, greet with Good Evening
        If an hour is not between 0 and 23 (inclusive), print This is not a valid hour
         */

        int hour = 14;

        if (hour > 6 && hour <= 12) {
            System.out.println("Good Morning");
        } else if (hour > 12 && hour < 15) {
            System.out.println("Good Afternoon");
        } else if (hour > 15 && hour < 22) {
            System.out.println("Gooe Evening");
        } else if (hour < 0 && hour >= 23) {
            System.out.println("This is not a valid hour");
        }

        System.out.println("----------------------------------------------------");

        /*
        Write a program that calculates the average of Math, Chemistry, and Biology scores and prints the grade table.
        Assume that each given score is valid (between 0 and 100).

        Input:
        Math = 50
        Chemistry = 60
        Biology = 70

        Output:
        Average is 60.0
        Grade is D

        Average of Scores
        90-100   A
        80-89    B
        70-79    C
        60-69    D
        0-59     F
             */

        double math = 50, chemistry = 60, biology = 70;
        double average = (math + chemistry + biology) / 3;


        if (average >= 90 && average <= 100) {
            System.out.println("Average is " + average);
            System.out.println("Grade is A");
        } else if (average >= 80 && average <= 89) {
            System.out.println("Average is " + average);
            System.out.println("Grade is B");
        } else if (average >= 70 && average <= 79) {
            System.out.println("Average is " + average);
            System.out.println("Grade is C");
        } else if (average >= 60 && average <= 69) {
            System.out.println("Average is " + average);
            System.out.println("Grade is D");
        } else {
            System.out.println("Grade is F");
        }

        System.out.println("----------------------------------------------------");

        //Revenue
        /*
        Write a program that calculates the revenue for a given product price and quantity.
        The program should apply a 10% discount if the revenue is more than 5000 and displays the discount and net
        revenue:
        revenue = price × quantity.
         */

        double price = 119.99;
        int quantity = 10;

        double revenue = price * quantity;
        double discount = price * quantity * .10;
        double netRevenue = revenue - discount;

        if (revenue > 5000) {
            System.out.println("Discount: $" + discount);
            System.out.println("Net Revenue: $" + netRevenue);
        } else {
            System.out.println("Revenue: $" + revenue);
        }

        System.out.println("----------------------------------------------------");

        double price1 = 1500;
        int quantity1 = 4;

        double revenue1 = price1 * quantity1;
        double discount1 = price1 * quantity1 * .10;
        double netRevenue1 = revenue1 - discount1;


        if (revenue1 > 5000) {
            System.out.println("Discount: $" + discount1);
            System.out.println("Net Revenue: $" + netRevenue1);
        } else {
            System.out.println("Revenue: $" + revenue1);
        }

        System.out.println("----------------------------------------------------");

        /*
        Nested If
        An if statement in another one is called a nested if statement.
        Outer and inner if statements can have infinite inner if statements.

        if(condition){
            if(condition){
                statement
            } else if (condition){
                statement
            } else {
                statement
            }
         */

        int salary1 = 40000;
        int yearsOnJob = 2;
        if (salary1 >= 30000) {
            if (yearsOnJob >= 2) {
                System.out.println("You are qualified for the loan.");
            } else {
                System.out.println("You are not qualified for loan yet.");
            }
        } else {
            System.out.println("You must earn at least $30,000 per year.");
        }

        System.out.println("----------------------------------------------------");

        /*
        Write a program using nested if evaluates the given score.
        If a score is less than 60, then print “Fail”
        If a score is greater or equal to 60, but less than 90, then print “Pass”
        If a score is greater or equal to 90, then print “Passed with Distinction”
        If a score is not between 0 and 100, then print “Invalid score”

        Ex 1
        Input: 75
        Output:
        Pass
         */

        int score = 75;

        if (score > 0 && score < 100) {
            if (score >= 90) {
                System.out.println("Pass with distinction");
            } else if (score >= 60) {
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }
        } else {
            System.out.println("Invalid");
        }

        System.out.println("----------------------------------------------------");

        /*
        Ex 2
        Input: 90
        Output:
        Passed with distinction

         */

        int score2 = 90;

        if (score2 > 0 && score2 < 100){
            if (score2 >= 90){
                System.out.println("Pass with Distinction");
            } else if (score <= 60) {
                System.out.println("Pass");
            } else{
                System.out.println("Fail");
            }
        } else{
            System.out.println("Invalid");
        }




        /*
        if statements make decisions based on a boolean expression.
        Based on the true or false evaluation of the expression, these statements take one of the two possible courses.
        Multi-branch “if” (“if - else if - else”) allows us to perform different actions based on multiple conditions.
        Use nested if statements with caution. It might decrease readability.
        Cover all possible conditions in conditional statements.
        Debugging is essential to ensure that a program runs as intended
         */

        System.out.println("----------------------------------------------------");


        /*
        Write a program using nested if which prints greeting words for a given hour with a 24-hour clock system.
        If an hour is after 6 but before 12 noon, greet with Good Morning
        If an hour is after 12 noon but before 15, greet with Good Afternoon
        If an hour is after 15 but before 22, greet with Good Evening
        If an hour is not between 0 and 23 (inclusive), print This is not a valid hour

        Ex:
        Input: Hour 14
        Output:
        Good Afternoon
         */
        int hour2 = 14;

        if (hour2 >= 0 && hour2 <= 24) {
            if (hour2 < 12){
                System.out.println("Good Morning");
            } else if (hour2 < 15) {
                System.out.println("Good Afternoon");
            } else {
                System.out.println("Good Evening");
            }
        } else{
            System.out.println("This is not a valid hour");
        }

        System.out.println("----------------------------------------------------");


        /*
        Write a program using nested if that calculates the average of Math, Chemistry, and Biology scores and prints the grade table.
        If any of the given marks is not between 0 and 100, then only print “Marks are not valid”

        Input:
        Math = 50
        Chemistry = 60
        Biology = 70

        Output:
        Average is 60.0
        Grade is D

        Average of Scores
        90-100   A
        80-89    B
        70-79    C
        60-69    D
        0-59     F
             */

        double math1 = 50, chemistry1 = 60, biology1 = 70;
        double average1 = (math1 + chemistry1 + biology1) / 3;

        if (average1 > 0 && average1 < 100) { //define expression to see if valid to proceed
            if (average1 >= 90) {
                System.out.println("Average is " + average1);
                System.out.println("Grade is A");
            } else if (average1 >=80) {
                System.out.println("Average is " + average1);
                System.out.println("Grade is B");
            } else if (average1 >= 70) {
                System.out.println("Average is " + average1);
                System.out.println("Grade is C");
            } else if (average1 >= 60) {
                System.out.println("Average is " + average1);
                System.out.println("Grade is D");
            } else {
                System.out.println("Grade is F");
            }
        } else {
            System.out.println("Grade is Invalid");
        }

        System.out.println("----------------------------------------------------");

        /*
        Switch statement executes statements based on the value of a variable or an expression.
        It executes one statement from multiple conditions.

        switch (expression){
        case constant1 :
            statement 1;
            statement 2
            ...
            break;
        case constant2 :
            statement 1;
            statement 2;
            ...
            break;
        default :
            statement 1;
            statement 2;
            ...
            break;
        }

            Like an if-else-if ladder statement

            The switch statement works with byte, short, int, char, String, and enum types
            Case value can be literal or constant, but not variables
            Case value must be unique, with no duplicates
            NO curly braces for case blocks, even in case of more than one statement
            Case block statements (including break) are optional
            Cam group multiple constants by a comma.

            If vs. Switch

            If-else statements                                               switch statements
            multiple expressions for multiple choices                   Single expression for multiple choices
            Checks for boolean expression(equality and inequality)      Checks only equality (fixed data value)
            Slower                                                      Significantly faster if many statements
            Code may be complex and head to read/edit                   Code more concise, readable, easy to edit
         */


        //Calculator


        int num10 = 100, num11 = 200; //define variable conditions

        int calculateOperator = '*'; //create variable to store case to run

        switch (calculateOperator){
            case '-':
                System.out.println("Subtraction = " + (num10 - num11));
                break;
            case '+':
                System.out.println("Addition = " + (num10 + num11));
                break;
            case '/':
                System.out.println("Division = " + (num10 / num11));
                break;
            case '*':
                System.out.println("Multiplication = " + (num10 * num11));
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }

        //Traffic Light Selector





    }

}

