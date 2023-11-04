package edu.traning.jc3;

public class Main09 {

    public static void main(String[] args) {

        int A = 2000000000;

        double AKylobyte = (double) A / 1024;
        double AMegabyte = (double) A / (1024 * 1024);
        double AGygabyte = (double) A / (1024 * 1024 * 1024);
        double ATerabyte = AGygabyte / 1024;

        System.out.println(AKylobyte+ " KB\n" + AMegabyte+ " MG\n" + AGygabyte + " GB\n"
                + ATerabyte + " TB" );
    }
}
