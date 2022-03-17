package main;

import java.util.Scanner;

public class LargestAmongThree {
    public static void main(String[] args) {
        LargestAmongThree largestAmongThree = new LargestAmongThree();
        System.out.println(largestAmongThree.largestOfThree());
    }

    Scanner sc = new Scanner(System.in);
    double arr[] = {sc.nextDouble(), sc.nextDouble(), sc.nextDouble()};

    public double largestNum = Integer.MIN_VALUE;

    public double largestOfThree() {
        for (double i : arr) {
            if (largestNum < i)
                largestNum = i;
        }
        return largestNum;
    }

}
