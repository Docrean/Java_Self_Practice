package day02_practice_tasks;

public class day02_practice_tasks {

    public static void main(String[] args) {

        int a, a1, a2;
        a1 = 40;
        a2 = 50;
        a = 60;

        double b1 =3.4, b2 = 2.2, b3 = 5.2;

        System.out.println(a + ", " + a1 + ", " + a2);

        System.out.println(b1 + ", " + b2 + ", " + b3);

        System.out.println("--------------------------------------");

        String man;
        man = "Java";

        System.out.println("man = " + man);

        System.out.println("--------------------------------------");

        byte c = 127;

        short d = 32_767;

        int f = 2_147_483_647;

        long g = 9_223_372_036_854_775_807L;

        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("f = " + f);
        System.out.println("g = " + g);

        System.out.println("--------------------------------------");

        float maxValue = 3.402823E+38f;

        double maxValue2 = 1.79769313486231570_308;
        long maxvalue3 = (long) maxValue2; //cast long to double. will print 1 before the .  since long does not accept decimal

        System.out.println("maxValue = " + maxValue);
        System.out.println("maxValue2 = " + maxValue2);
        System.out.println("maxvalue3 = " + maxvalue3);

        System.out.println("--------------------------------------");

        //casting

        int year1 = 141343153;
        byte year2 = (byte) year1; //cast byte into int value with new byte variable year2 and cast into year1 int range
        short year3 = (short) year1; //cast short into int value with new byte variable year3 and cast into year1 int range
        System.out.println("year = " + year1);

        System.out.println("--------------------------------------");

        boolean isHappy = true;
        //isHappy = false; //re-assigned boolean prints false. java compiles up->down left->right
        boolean isSitting = true;
        //isSitting = false; //re-assigned boolean prints false.


        System.out.println("isHappy = " + !isHappy); //logical not reterses result
        System.out.println("isSitting = " + !isSitting);

        System.out.println("--------------------------------------");


        char ph1 = 'B', ph2 = 72, ph3 = 0x52, ph4 = '\u0066';

        System.out.println("ph1 = " + ph1);
        System.out.println("ph2 = " + ph2);
        System.out.println("ph3 = " + ph3);
        System.out.println("ph4 = " + ph4);

        char ph6 = '@';

        System.out.println(ph6);

        String hello;
        hello = "World Hello there";

        String batooty = "Manoody";

        String name1, name2, name3;
        name1 = "money";
        name2 = "mulla";
        name3 = "neaderthal";

        String BK = "JaVa is ";
        String BK2 ="thee creme de la creme.";
        String concat = BK + BK2;

        System.out.println(concat);

        int num = 2;
        System.out.println("What is one more than one? " + num);

        double Panzee;
        Panzee = 28;
        System.out.println("Panzee = " + Panzee);

        float Pool = 21f;
        System.out.println("Pool = " + Pool);

        //FlightATicket

        String from = "London", to = "Washington DC";
        double ticketPrice = 200;

        System.out.println("From " + from + " to " + to + " is $" + ticketPrice);

       /*
        package m09_my_first_program;<-------------------package name
        public class HelloWorld<-{-----------------------class name
            public static void main(String[] args) {
                System.out.println("Hello World");
                                                            args = variable name
                                                            String[] = class name
                                                            main and println = Method name
                                                            out = Variable name
                                                            System = CLass name

            Identifier              Naming Convention                   Examples
            Variables               Should be noun &Lower Camel Case    firstName, indexNumber, name, number1, number2
            Constants               Screaming Snake Case                TAX_RATE, INTEREST_RATE
            Classes                 Should be noun & Upper Camel Case   HelloWorld, AssigningVariables,String, WholeNumbers
            Packages                All lowercase (underscore ( _ )     my_first_program
                                    can be used between words)
            Methods                 Should be verb & Lower Camel Case   print(), getColor(), draw(), getName()
            Interfaces              Should be adjective & Upper Camel   my_first_program
                                    Case

                            First character should be letter
                            Dollar sign($) should not be used
                            THe underscore(_) character is most commonly used for constants and packages
                            Our custom class names should not be same with the library(built-in) classes
        */













    }
}
