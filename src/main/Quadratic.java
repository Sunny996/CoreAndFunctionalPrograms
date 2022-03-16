package main;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Quadratic quadratic = new Quadratic();
        System.out.println(quadratic.root1(quadratic.a, quadratic.b, quadratic.c));
        System.out.println(quadratic.root2(quadratic.a, quadratic.b, quadratic.c));
    }

    Scanner sc = new Scanner(System.in);
    public double a = sc.nextDouble();
    public double b = sc.nextDouble();
    public double c = sc.nextDouble();

    public double delta(double x, double y, double z) {
        return (Math.pow(y, 2) - 4 * x * z);
    }

    public double root1(double a, double b, double c) {
        return (-1 * b + Math.sqrt(delta(a, b, c)) / (2 * a));
    }

    public double root2(double a, double b, double c) {
        return (-1 * b - Math.sqrt(delta(a, b, c)) / (2 * a));
    }

}
