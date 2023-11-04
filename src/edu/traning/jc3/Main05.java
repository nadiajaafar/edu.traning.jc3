package edu.traning.jc3;
import java.lang.Math;

public class Main05 {

    public static void main(String[] args) {

        int Rd = 2;

        double Gr = (Rd * 180) / Math.PI;

        double Gr1 = (int)Gr;


        double M1 = Rd * (60 * 180) / Math.PI;


        double S = (Rd * 3600* 180)/ Math.PI;

        System.out.println(Gr1+ " градусов\n"+M1+ " минут\n"+ S+" секунд" );




    }
}
