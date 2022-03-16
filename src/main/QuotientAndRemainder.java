package main;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        QuotientAndRemainder quotientAndRemainder = new QuotientAndRemainder();
        System.out.println(quotientAndRemainder.quotient());
        System.out.println(quotientAndRemainder.remainder());
    }
    Scanner sc= new Scanner(System.in);
    double dividend=sc.nextDouble();
    double divisor=sc.nextDouble();

    public int quotient(){
        return (int)(dividend/divisor);
    }
    public int remainder(){
        return (int)(dividend%divisor);
    }
}
