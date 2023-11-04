package edu.traning.jc3;

public class Main08 {

    public static void main(String[] args) {

        char S = 'к';

        int unicodeCodePoint = (int) S;

        char S1 = (char) (unicodeCodePoint - 1);

        char S2 = (char) (unicodeCodePoint + 1);

        System.out.println("Порядковый номер символа " + unicodeCodePoint + " ,следующий символ  " +
                S2 + " предыдущий символ " + S1);


    }
}
