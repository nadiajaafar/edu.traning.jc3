package edu.traning.jc3;

public class Main10 {

    public static void main(String[] args) {

        int M = 4;
        int N = 2;

        double divisionResult = (double) M / N;


        int integerPart = (int) divisionResult;
        int leastSignificantDigit = integerPart % 10;


        double fractionalPart = divisionResult - integerPart;
        int mostSignificantDigit = (int) (fractionalPart * 10);

        System.out.println("Младшая цифра целой части: " + leastSignificantDigit);
        System.out.println("Старшая цифра дробной части: " + mostSignificantDigit);


    }
}
