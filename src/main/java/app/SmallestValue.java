package app;

import java.util.Scanner;

public class SmallestValue {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double x = in.nextDouble();
        System.out.print("Input the Second number: ");
        double y = in.nextDouble();
        System.out.print("Input the third number: ");
        double z = in.nextDouble();
        System.out.print("The smallest value is " + smallest(x, y, z)+"\n" );
    }

    public static double smallest(double x, double y, double z)
    {
        return Math.min(Math.min(x, y), z);
    }

    public static class Tut8 {
        public static void main(String[] NDSHG) {

            int x1=1;
            int x2=1;
            System.out.println("فضلا ادخل الرقم الاول ");
            System.out.println("للخروج اضغط على زر 0 ");

            Scanner y = new Scanner(System.in);
            x1 = y.nextInt();
            chik(x1, 0);
            System.out.println("فضلا ادخل الرقم الاول ");
            System.out.println("للخروج اضغط على زر 0 ");
            x2 = y.nextInt();
            chik(x2, 1);

            System.out.println("ماهي العملية التي تود القيام بها ");
            System.out.println(" 1 - الجمع ");
            System.out.println("2 - الطرح ");
            System.out.println("3 -الضرب ");
            System.out.println("4 -القسمة ");

            String o=y.next();
            switch (o){
                case "1" :
                    int ntejah1=x1 + x2 ;
                    System.out.println("ناتج العملية يساوي  " + ntejah1);
                    break;
                case "2":
                    int ntejah2= x1 - x2 ;
                    System.out.println("ناتج العملية يساوي  " + ntejah2 );
                    break;

                case "3":
                    int ntejah3= x1 * x2 ;
                    System.out.println("ناتج العملية يساوي  " + ntejah3);
                    break;
                case "4":
                    int ntejah4= x1 / x2;
                    System.out.println("ناتج العملية يساوي  " + ntejah4);
                    break;

            }


        }

        private static void chik(int x2, int i) {
            if (x2 == i) {
                System.out.println("تم الخروج من البرنامج ");
                System.exit(0);
            }
        }

    }
}
