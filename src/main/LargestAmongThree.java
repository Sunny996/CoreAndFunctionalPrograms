package main;

import java.util.Scanner;

public class LargestAmongThree {
    public static void main(String[] args) {
        LargestAmongThree largestAmongThree = new LargestAmongThree();
        largestAmongThree.largestOfThree();
    }

    Scanner sc = new Scanner(System.in);
    double arr[] = {sc.nextDouble(), sc.nextDouble(), sc.nextDouble()};

    public double largestNum = Integer.MIN_VALUE;

    public void largestOfThree() {
        if(Double.compare(arr[0],arr[1])==0 && Double.compare(arr[2],arr[1])==0)
            System.out.println("All three values are equal");
        else{
        for (double i : arr) {
            if (largestNum < i)
                largestNum = i;
        }
            System.out.println("The largest of three is "+largestNum);}
    }

}
