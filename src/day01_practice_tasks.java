public class day01_practice_tasks {

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
        
    }
}
