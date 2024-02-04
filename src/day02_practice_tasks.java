public class day02_practice_tasks {

    public static void main(String[] args) {

        int a, a1, a2;
        a1 = 40;
        a2 = 50;
        a = 60;

        double b1 =3.4, b2 = 2.2, b3 = 5.2;

        System.out.println(a + ", " + a1 + ", " + a2);

        System.out.println(b1 + ", " + b2 + ", " + b3);

        String man;
        man = "Java";

        System.out.println("man = " + man);

        byte c = 127;

        short d = 32_767;

        int f = 2_147_483_647;

        long g = 9_223_372_036_854_775_807l;

        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("f = " + f);
        System.out.println("g = " + g);

        float maxValue = 3.402823E+38f;

        double maxValue2 = 1.79769313486231570_308d;

        System.out.println("maxValue = " + maxValue);
        System.out.println("maxValue2 = " + maxValue2);


        boolean isHappy = true;
        isHappy = false; //next assigned boolean prints the result. java compiles up->down left->right
        boolean isSitting = true;
        isSitting = false; //next assigned boolean prints the result

        System.out.println("isHappy = " + isHappy);
        System.out.println("isSitting = " + isSitting);

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
                                                            (String[] = class name
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
