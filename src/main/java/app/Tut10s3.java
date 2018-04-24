package app;

import java.util.Scanner;

public class Tut10s3 {
    public static void main (String[]Reqste){
        Scanner vor = new Scanner(System.in);
        System.out.println("ادخل قطر الدائرة المراد حساب حجمها ");
        double sas = vor.nextDouble();
        System.out.println("حجم الدائره يساوي " + sphereVolume(sas)  );

    }
     static double sphereVolume (double radius){
        double volume = (4.0/3.0)* Math.PI *Math.pow(radius, 3);
        return volume;



    }

}
