import java.text.spi.NumberFormatProvider;

public class Tut10s11 {
    public static void main(String[] arhjgs) {

        String s = "12345666215452145214545121521552";
        int a;

        try {
            System.out.println("s.charAt (28):");
            a = Integer.parseInt(s);


        }

        catch (Exception e3 ){
            System.out.println(  " اخطاء اخره  " + e3);
            System.out.println( e3.getMessage() );
            System.out.println( e3.toString() );
             e3.printStackTrace();
        }
        finally {
            // Optional Cleanup Code
            // هنا نقوم بكتابة أوامر للتخلي عن أي شيء لم يعد البرنامج بحاجة له
            System.out.println(" انتهى " );
        }


        System.out.println( " البرنامج مازال يعمل بشكل صحيح ");
    }


}

