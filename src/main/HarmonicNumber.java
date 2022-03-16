package main;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        HarmonicNumber harmonicNumber = new HarmonicNumber();
        System.out.println("Nth Harmonic Value " + harmonicNumber.harmonicNumberCalculation(Integer.parseInt(args[0])));
    }

    Scanner sc = new Scanner(System.in);

    double harmonic = 0;

    public double harmonicNumberCalculation(int N) {
        if (N != 0) {
            for (int n = 1; n <= N; n++)
                harmonic += (1 / n);
        }
        return harmonic;
    }
}
