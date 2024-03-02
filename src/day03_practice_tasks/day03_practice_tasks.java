package day03_practice_tasks;

public class day03_practice_tasks {//<--class package to create java program

    public static void main(String[] args) {//<--public static void/method, class, variable to create java program

        double celsius = 26.8;
        double fahrenheit;

        fahrenheit = (celsius * 1.8) + 32;

        System.out.println("fahrenheit = " + fahrenheit);  //print to console string with variable fahrenheit


        //operator tells compiler to perform specific mathematical/logical operations

        /* quantity + 5;

        quantity + 5 = expression
        quantity = variable operand
        + = operator
        5 = constant operand

        Operators:

        Unary operator: Works with single operand: -/+ sign of numbers
        Binary operator: Works with two operands: arithmetic operators
        Ternary operator: Works with three operands

        Arithmetic operators = binary operators

        Name        Operator        Algebra expression          Java expression
        Addition        +               10 + 5                      10 + 5
        Subtraction     -               10 - 5                      10 - 5
        Division        /               10 / 5 or 10 ÷ 5 or 10/5    10 / 5
        Multiplication  *               10 x 5                      10 * 5
        Modulus         %               10 mod 3                    10 % 3

         */

        int mod = 11 % 3; //tests if number is even or odd. individual or group of digits

        int mod2 = 15 % 2;

        System.out.println(mod);
        System.out.println(mod2);

        int add = 10 + 5, minus = 10 - 5, divide = 10 / 5, multiply = 10 * 5;

        int mod3 = 10 % 3, mod4 = 9 % 2, mod5 = 14 % 2, mod6 = 1234 % 10;

        System.out.println("add = " + add);
        System.out.println("minus = " + minus);
        System.out.println("divide = " + divide);
        System.out.println("multiply = " + multiply);
        System.out.println("mod3 = " + mod3);
        System.out.println("mod4 = " + mod4);
        System.out.println("mod5 = " + mod5);
        System.out.println("mod6 = " + mod6);

        System.out.println("078" + " " + "05" + " " + "1120");


        int chairs = 40;
        System.out.println(chairs + 2); //42
        int moreChairs = chairs + 5;
        System.out.println(moreChairs); //45

        //Operator Precedence
            // "PEMMDAS"
                //1st. Parenthese(control evaluation) 2. Multiply 3. Modulus 4. Divide 5. Add 6. Subtract LEFT TO RIGHT

        int output = 12 + 6 - 3; //arithmetics of same group so LEFT TO RIGHT
        System.out.println("output = " + output);

        int output2 = 15 + 6 / 3 - 2;
        System.out.println("output2 = " + output2);

        int output3 = 20 * 2 / 10 + 4;
        System.out.println("output3 = " + output3);

        int output4 = 5 - (5 * 5);
        System.out.println("output4 = " + output4);

        double output5 = 8.34 + (2.4 * 9.2);
        System.out.println("output5 = " + output5);

        int output6 = 8 * 7 + (3 + 9);
        System.out.println("output6 = " + output6); //parentheses first than order left to right

        // number + number = addition
        //number + String = concatenation
        //String + String = concatenation

        System.out.println(2 + 2); //4 as addition
        System.out.println("Cydeo " + 10); //Cydeo 10 as concatenation
        System.out.println("She sells sea shells " + "by the sea shore."); //2 String concatenation

        System.out.println(3 + 5); //8
        System.out.println(3 + 5 + " Cydeo " + 3 + 5); //8 Cydeo 35 (addition left to right then string then concat
        System.out.println(3 + 5 + " Cydeo " + (3 + 5)); //8 Cydeo 8 (addition parentheses then addition left to right than String

        System.out.println((6 * 5) + 7 + " Cydeo "+ 2 + " " + (7 * 7)); //37 Cydeo 2 49
        System.out.println(7 * (30 / 10) + " Boogy " + 15 / 3 * (35 / 7)); //21 Boogy 25

        //Add One

        int num1 = 2_147_483_647;
        long num2 = 9_223_372_036_854_775_807l;

        System.out.println("num1 = " + (num1 + 1)); //result - since out of int range
        System.out.println("num2 + " + (num2 + 1)); //result - since out of long range

        //Kilometers to miles

        double kilometers = 10.5;

        double milesToKilometers = (.621371 * kilometers);

        System.out.println("10.5 Kilometers equals to " + milesToKilometers + " miles");


        //discount

        int regularPrice = 100;
        double discount = (regularPrice * .2);
        double salesPrice = regularPrice - discount;

        System.out.println("Regular Price: $" + 100);
        System.out.println("Discount Amount: $" + discount);
        System.out.println("Sale Price: $" + salesPrice);

        //SwapTwoVariables1

        int num4 = 10;
        int num5 = 15;
        int temp;

        temp = num5; //temp 5 is now num5 15
        num5 = num4; //num5 15 is now num4 10
        num4 = temp; //num4 10 is now temp 15

        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);

        int num6 = 10;
        int num7 = 15;
        int num8 = 17;
        int num9 = 20;
        int temp2;

        temp2 = num6;
        num6 = num7;
        num7 = temp2;
        temp2 = num9;
        num9 = num8;
        num8 = temp2;

        System.out.println("num6 = " + num6);
        System.out.println("num7 = " + num7);
        System.out.println("num8 = " + num8);
        System.out.println("num9 = " + num9);

        //SwapTwoVariables2

        int num10 = 10;
        int num11 = 15;

        num10 = num11 - 5;
        num11 = num10 + 5;


        System.out.println("num10 = " + num10);
        System.out.println("num11 = " + num11);

        System.out.println(5 + 2 * 4 - 3); //10
        System.out.println(5 * 10 / (4 - 2)); //25
        System.out.println((6 - 3) * (2 + 7) / 3);//9
        System.out.println("8" + 12 * 2 + 4); //8244
        System.out.println(4 + 17 % 2 + "Cydeo" + 1 + 5); //5Cydeo15

    }
}
