package day04_practice_tasks;

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
        System.out.println("Hello " + name + "," ); //declare first dataType (String name)
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

        System.out.println( name1 + " was born on " + birthMonth + "/"
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
                + ", " + miles + " miles, " + color + ", $" + Price+ ".");

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
        if (5 > 2){
            i = --i + 6; //first decrements value of i then adds 6
            System.out.println(i);
        }


        System.out.println("----------------------------------------------------");

        /*
        Write a program to calculate weekly wage for a given working hours.
        A company’s normal weekly wage is $ 900. It is multiplied by 1.5 if an
        employee’s working hours is greater than 40.
         */

        int workingHours = 60;
        int weeklyWage = 900;

        if (workingHours > 40){
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

        if (number1 >= 20){ //false. if statement prints only true. won't print
            System.out.println("I have more than 20 watermelons");
        }
        if (isEnough){//declared isEnough is false. won't run.
            System.out.println("Good Job");
        }
        if (!isEnough){//the reverse of isEnough declared is true. if statement prints true.
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
        if (birthYear1 < 2024){
            System.out.println("True");;
        } else{
            System.out.println("False");
        }

        if (birthYear2 > 2024){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

}
