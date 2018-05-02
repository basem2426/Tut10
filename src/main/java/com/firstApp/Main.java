package com.firstApp;

public class Main {

    public static void main (String[] agree ){

        Student s1 = new Student();
        s1.setName("محمد");
        s1.setDegree1(25);
        s1.setDegree2(15);
        System.out.println("اسم الطالب :  "+s1.getName());
        System.out.println("مجمع العلامات "+s1.getSam());
        System.out.println("نسبة الاختبار العملي "+s1.getNsba());
        System.out.println("الدرجة النهائية "+s1.gitfainal());


        Student s2 = new Student();
        s2.setName("عمر");
        s2.setDegree1(5);
        s2.setDegree2(20);
        System.out.println("اسم الطالب :  "+s2.getName());
        System.out.println("مجمع العلامات "+s2.getSam());
        System.out.println("نسبة الاختبار العملي "+s2.getNsba());
        System.out.println("الدرجة النهائية "+s2.gitfainal());

        Student s3 = new Student();
        s3.setName("علي");
        s3.setDegree1(20);
        s3.setDegree2(20);
        System.out.println("اسم الطالب :  "+s3.getName());
        System.out.println("مجمع العلامات "+s3.getSam());
        System.out.println("نسبة الاختبار العملي "+s3.getNsba());
        System.out.println("الدرجة النهائية "+s3.gitfainal());

        Student s4 = new Student();
        s4.setName("عثمان");
        s4.setDegree1(16);
        s4.setDegree2(10);
        System.out.println("اسم الطالب :  "+s4.getName());
        System.out.println("مجمع العلامات "+s4.getSam());
        System.out.println("نسبة الاختبار العملي "+s4.getNsba());
        System.out.println("الدرجة النهائية "+s4.gitfainal());


    }

}
