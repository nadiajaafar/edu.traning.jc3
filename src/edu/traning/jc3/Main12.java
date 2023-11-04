package edu.traning.jc3;
import java.lang.Math;

public class Main12 {

    public static void main(String[] args) {

        int number = 16;

        if (number / 100 == 0 && number % 2 == 0) {

            System.out.println("true");
        } else {
            System.out.println("false");
        }


        int number1 = 2335;

        int thousands = number1 / 1000;
        int hundreds = number1 / 100;
        int secondnum = hundreds - (thousands * 10);
        int tens = number1 / 10;
        int thirdnum = tens - (hundreds * 10);
        int fourthnum = number1 - (tens * 10);


        if (thousands + secondnum == thirdnum + fourthnum) {

            System.out.println("true");
        } else {

            System.out.println("false");
        }

//    Сумма цифр данного трехзначного числа N является четным числом.
        int N = 123;

        int hundreds1 = N / 100;
        int tens1 = N / 10;
        int secondnum1 = tens1 - (hundreds1 * 10);
        int thirdnum1 = N - (tens1 * 10);


        if ((hundreds1 + secondnum1 + thirdnum1) % 2 == 0) {

            System.out.println("true, cумма цифр данного трехзначного числа " + N + " является четным числом");
        } else {
            System.out.println("false");
        }

        int x = 1;
        int y = 1;
        int m = 2;
        int n = 3;

        if (x >= m && x <= n) {
            System.out.print("True: ");
        } else {
            System.out.print("False: ");
        }
        System.out.println("Точка с координатами (" + x + ", " + y + ") принадлежит части плоскости, лежащей между прямыми х = " + m + ", х = " + n + " (m < n).");

        int M = 123;

        int hundreds2 = M / 100;
        int tens2 = M / 10;
        int secondnum2 = tens2 - (hundreds2 * 10);
        int thirdnum2 = M - (tens1 * 10);


        if (Math.pow((hundreds2 + secondnum2 + thirdnum2), 3) == Math.pow(M, 2)) {

            System.out.println("true, квадрат " + M + " равен " +
                    "кубу суммы цифр этого числа ");
        } else {
            System.out.println("false, квадрат " + M + " НЕ равен " +
                    "кубу суммы цифр этого числа ");
        }

        int a = 12;
        int b = 10;
        int c = 12;

        if (a == c || a == b || b == c) {
            System.out.println("Треугольник со сторонами " + a + "," + b + "," + c + " является равнобедренным");
        } else {
            System.out.println("Треугольник со сторонами " + a + "," + b + "," + c + " НЕ является равнобедренным");
        }


        int Pr = 123;

        int hundreds3 = Pr / 100;
        int tens3 = Pr / 10;
        int secondnum3 = tens3 - (hundreds3 * 10);
        int thirdnum3 = Pr - (tens1 * 10);


        if ((hundreds3 + secondnum3) == thirdnum3 || (hundreds3 + thirdnum3) == thirdnum3 || (thirdnum3 + secondnum3) == thirdnum3) {

            System.out.println("Сумма каких-либо двух цифр заданного трехзначного натурального числа " + Pr + " равна третьей цифре.");
        } else {

            System.out.println("Сумма каких-либо двух цифр заданного трехзначного натурального числа " + Pr + " равна третьей цифре.");
        }


        int N1 = 32;
        int a1 = 2;

        if ((N1 == 1) || (N1 == a1) || (N1 == a1 * a1) || (N1 == Math.pow(a1, 3)) || ((N1 == Math.pow(a1, 4)))) {
            System.out.println("True: число " + N1 + " является степенью числа " + a1 + " (показатель степени может находиться в диапазоне от 0 до 4).");

        } else {
            System.out.print("False");
        }


        double a2 = 5.0;
        double b2 = 7.0;
        double c2 = 8.0;
        double n2 = 4.0;
        double m2 = 9.0;

        if (m2 == a2 * n2 * n2 + b2 * n2 + c2) {

            System.out.println("True: график функции у = " + a2 + "х2 + " + b2 + "х+ " + c2 + " проходит через заданную точку с координатами (" + n2 + ", " + n2 + ")");
        } else {
            System.out.print("\nFalse");
        }


    }

}

















