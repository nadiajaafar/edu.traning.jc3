package edu.traning.jc3;

public class Main11 {


    public static void main(String[] args) {

        int number = 1567;
        int evenProduct = 1;
        int oddProduct = 1;

        while (number > 0) {

            int digit = number % 10;
            if (digit % 2 == 0) {
                evenProduct *= digit;
            } else {
                oddProduct *= digit;
            }
            number /= 10;
        }

        if (oddProduct != 0) {
            double quotient = (double) evenProduct / oddProduct;
            System.out.println("Частное произведений четных и нечетных цифр: " + quotient);
        } else {
            System.out.println("Нулевое произведение нечетных цифр. Нельзя вычислить частное.");
        }
    }

}


