package app;

import java.security.PublicKey;

public class tut9 {
    public static void main(String[] aergs) {
//        char c1 = 'B';
//        char c2 = 10;
//
//
//        Character c11 = 'B';
//        Character c21 = 10;
//
//        System.out.println(Character.isLetter(c11));
//        System.out.println(Character.isDigit(c11));


//        System.out.println("\t bass ");
//        System.out.println("\b bass ");
//        System.out.println("\n bass ");
//        System.out.println("\r bass ");
//        System.out.println("\f bass ");
//        System.out.println("\' bass ");
//        System.out.println("\" bass ");

//        String name = "java";
//        char nameLength = name.charAt(0);
//        System.out.println(nameLength);


        String str1 = "باسم  ";
        String str2 = "محمد ";

        System.out.println("String 1:" + str1);
        System.out.println("String 2:" + str2);

        String str3 = str1.concat(str2);


        System.out.println("النص كاملآ بعد الربط" + str3);

    }

    private static void test2() {
        String str1 = "this is exercise1 ";
        String str2 = "this is exercise1 ";

        System.out.println("string 1=" + str1);
        System.out.println("string 2=" + str2);

        int result = str1.compareToIgnoreCase(str2);

        if (result < 0) {
            System.out.println("\"" + str1 + "\"" + " اقل من " + "\"" + str2 + "\"");
        } else if (result == 0) {
            System.out.println("\"" + str1 + "\"" + " يساوي " + "\"" + str2 + "\"");
        } else {
            System.out.println("\"" + str1 + "\"" + " أكبر من " + "\"" + str2 + "\"");
        }
    }
}




