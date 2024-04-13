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

        System.out.println("---------------------------------------------");

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

        System.out.println("---------------------------------------------");


        int chairs = 40;
        System.out.println(chairs + 2); //42
        int moreChairs = chairs + 5;
        System.out.println(moreChairs); //45

        System.out.println("---------------------------------------------");

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

        System.out.println("---------------------------------------------");

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

        System.out.println("---------------------------------------------");


        //Add One

        int num1 = 2_147_483_647;
        long num2 = 9_223_372_036_854_775_807l;

        System.out.println("num1 = " + (num1 + 1)); //result - since out of int range
        System.out.println("num2 + " + (num2 + 1)); //result - since out of long range

        System.out.println("---------------------------------------------");


        //Kilometers to miles

        double kilometers = 10.5;

        double milesToKilometers = (.621371 * kilometers);

        System.out.println("10.5 Kilometers equals to " + milesToKilometers + " miles");

        System.out.println("---------------------------------------------");

        //discount

        int regularPrice = 100;
        double discount = (regularPrice * .2);
        double salesPrice = regularPrice - discount;

        System.out.println("Regular Price: $" + 100);
        System.out.println("Discount Amount: $" + discount);
        System.out.println("Sale Price: $" + salesPrice);

        System.out.println("---------------------------------------------");


        //SwapTwoVariables1 using third variable

        int num4 = 10;
        int num5 = 15;
        int temp;

        temp = num5; //temp is now num5 15
        num5 = num4; //num5 15 is now num4 10
        num4 = temp; //num4 10 is now temp 15

        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);

        System.out.println("---------------------------------------------");


        //Swap 4 variables using a 5th variable

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

        System.out.println("---------------------------------------------");


        //SwapTwoVariables2 without using third variable

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

        System.out.println("---------------------------------------------");

        //Primitive Casting

        /*
        Implicit casting (Widening primitive conversion)
        Explicit casting (Narrowing primitive conversion)

        Implicit
        Casting smaller prim types to larger prim types
        Done automatically by compiler

        byte-->short-->int-->long-->float-->double
                   char-|
         */

        //ImplicitPractice
         byte num15 = 25;
         int num16;
         num16 = num15;

        System.out.println(num16);

        System.out.println("---------------------------------------------");

        double num17;
        int num18 = 10;
        num17 = num18;

        System.out.println(num17);

        System.out.println("---------------------------------------------");

        /*
        Explicit Casting (Narrowing Primitive Conversion)

        Casting larger primtive types to smaller primitive types
        There is a risk of losing data
        Must be done explicitly (by programmer).

        doubel-->float-->long-->int-->short-->byte
                                 |--char

         */

        int b = 12;
        byte a = (byte) b;
        System.out.println(a);

        System.out.println("---------------------------------------------");

        long c = 14;
        int e = (int) c;
        System.out.println(e);

        System.out.println("---------------------------------------------");

        /*
        Mixed Operations
        Operation involving two different data types(besides byte and short),
        the smaller is casted implicitly to the larger type.

        byte and short are implicitly casted to int type before arithmetic operation

            int x + int y       // returns int
            int x - long y      // returns long
            long x * float y    // returns float
            float x / double y  // returns double
            byte x + byte y     // returns int
            byte x - short y    // returns int
            int x * byte y      // returns int
            short x / byte y    // returns in
         */

        System.out.println("---------------------------------------------");

        /*
        Shorthand(compound assignment) operators

            Addition Assignment         x += y means x = x + y
            Subtraction Assignment      x -= y means x = x – y
            Multiplication Assignment   x *= y means x = x * y
            Division Assignment         x /= y means x = x / y
            Remainder Assignment        x %= y means x = x % y
         */

        System.out.println("-----------------------------------------------");

        /* Operator Precedence

        1 ( )                   Parentheses                                 Parentheses
        2 * / %     Multiplication / Division / Modulus     Left to right   Arithmetic
        3 + -       Addition / Subtraction                  Left to right   Arithmetic
        4  =
         += -=
         *= /=
           %=                       Assignment               Right to left   Assignment
                    Addition assignment / Subtraction assignment
                    Multiplication assignment / Division assignment
                                 Modulus assignment
         */


        // Total Price

        double price = 20.5;
        int quantity = 4;

        price *= quantity;

        System.out.println("price = " + price);

        System.out.println("-----------------------------");

        int price1 = 50;
        int quantity1 = 5;

        price1 *= quantity1;

        System.out.println("price = " + price1);

        System.out.println("-----------------------------");

        int x = 2, y = 3, z = 9;

        y *= x + 5; //y = y * x + 5 = 21 (Assignment operator computes right to left)
        z %= y; //z = z % y = 0
        z += 2.5; //z = z + 2.5 = 11.5

        System.out.println("y = " + y);
        System.out.println("z = " + z);

        System.out.println("-----------------------------");

        /*
        Unary Operator

        +   Unary Plus Operator     Indicates positive value
        -   Unary Minus Operator    Negates an expression or value
        ++  Increment Operator      Increments a value by 1
        --  Decrement Operator      Decrements a value by 1
        !   Logical Complement      Operator Inverts the value of a boolean variable

        The unary plus (+) operator is used to indicate that a numeric value is positive.

        The unary minus (-) operator is used to negate a numeric value, effectively changing its sign.
         */

        int h = 5;
        int i = +h;

        System.out.println(i);

        System.out.println("-----------------------------");

        int u = 10;
        int t = -u + 5;

        System.out.println(t);

        System.out.println("-----------------------------");

        int r = 24;
        int f = +r + 30;
        int m = -r + 45;

        System.out.println(m);

        System.out.println("-----------------------------");

        /*
       Increment (++) & Decrement (--)

       Pre-Increment (++) & Pre-Decrement (--)
        Increase or decrease then give me the number.
        Post-Increment (++) & Post-Decrement (--)
        Give me the number then increase or decrease.

        Only for integral data types (int, short, byte, long, and char).
         */

        boolean isMarried = true;
        boolean isEligible = false;

        boolean results1 = !isMarried;
        boolean results2 = !isEligible;

        System.out.println(!isEligible);
        System.out.println(!isMarried);

        System.out.println("-----------------------------")

        /*
        1                ( )                 Parentheses                             Parentheses

           2                ++ --               Unary post-increment / decrement        Left to Right
           3                ++ --               Unary pre-increment / decrement
                            + -                 Unary plus / minus                                          Unary
                            !                   Unary logical negation
                            ( type )            Unary type cast                         Right to left
            4               * / %               Multiplication / Division / Modulus     Left to right
            5               + -                 Addition / Subtraction                  Left to right       Arithmetic
            6               =                   Assignment
                            += -=               Addition assignment / Subtraction assignment
                            *= /=               Multiplication assignment / Division assignment
                            %=                  Modulus assignment                      Right to left       Assignment

       /*

    }
}
