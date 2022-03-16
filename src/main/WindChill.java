package main;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        WindChill windChill = new WindChill();
        windChill.effectiveTemp();

    }

    Scanner sc = new Scanner(System.in);
    double t = sc.nextDouble();
    double v = sc.nextDouble();

    public void effectiveTemp() {
        if (t > -50 && t < 50 && v > 3 && v < 120)
            System.out.println((35.76 + 0.6215 * t + (0.4275 * t - 35.75) * (Math.pow(v, 0.16))));
        else
            System.out.println("Invalid t or v values");

    }
}
