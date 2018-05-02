package com.firstApp;

public class Student {
     private int id ;
     private String name;
     private int degree1;
     private int degree2;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDegree1() {
        return degree1;
    }

    public void setDegree1(int degree1) {
        this.degree1 = degree1;
    }

    public int getDegree2() {
        return degree2;
    }

    public void setDegree2(int degree2) {
        this.degree2 = degree2;
    }

    public int getSam(){
        int sum = this.degree1+ this.degree2 ;
        return sum;


    }
    public double getNsba(){

      double nsba = (10*getSam())/100;
      return nsba;

    }

    public double gitfainal(){

        double fainal = getSam()+getNsba();
        return fainal;

    }
}
