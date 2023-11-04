package edu.traning.jc3;

public class Main07 {

    public static void main(String[] args) {

            int h = 2;
            int m = 50;
            int s = 56;

            int r = 3;
            int q = 45;

            int C = (h * 3600) + (m * 60) + s;

            int I = (r * 3600) + (q * 60) + r;

           int S  = I + C;

           int h1 = S/3600;
           int m1 = (S%3600)/60;
           int s1 = S%60;

        System.out.println("Время:"+ h1 + " часов " + m1 +" минут "+ s1+ " секунд");





    }


}
