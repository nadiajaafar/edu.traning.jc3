package edu.traning.jc3;
import java.lang.Math;

public class Main06 {

    public static void main(String[] args) {

        int a = 10;
        int b = 10;
        int c = 10;

        double A = Math.acos((Math.pow(b,2) + Math.pow(c,2) - Math.pow(a,2)) / (2*b*c));

        double B = Math.acos((Math.pow(a,2) + Math.pow(c,2) - Math.pow(b,2)) / (2*a*c));

        double C =  Math.acos((Math.pow(a,2) + Math.pow(b,2) - Math.pow(c,2)) / (2*a*b));

        int A1 = (int) (A * (180/Math.PI));

        int B1 = (int) (B * (180/Math.PI));

        int C1 = (int) (B * (180/Math.PI));

        System.out.println("A =" +A +" рад\n"+"B ="+B+" рад\n"+ "С =" + C+"рад\n");

        System.out.println("A1 =" +A1 +" гр\n"+"B1 ="+B1+" гр\n"+ "С1 =" + C1+" гр\n");



    }

}
