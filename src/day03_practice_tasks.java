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

K

    }
}
