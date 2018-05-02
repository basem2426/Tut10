package app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tut10s4 {
    public static void main(String[] args) {

        int a = 0;

        Scanner o = new Scanner(System.in);

        System.out.println(" أدخل الرقم ");

        try {

            a = o.nextInt();

        } catch (InputMismatchException ex) {
            System.out.println(" فضلا تاكد من الرقم المدخل ");

        }

    }
}


