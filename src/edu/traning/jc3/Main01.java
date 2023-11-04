package edu.traning.jc3;

public class Main01 {


    public static void main(String[] args) {

        double R = 123.456;

        double a = (int) R / 1000.0;
        double b = (int) ((R - (int) R) * 1000.0);
        System.out.println(a + b);

    }
}

