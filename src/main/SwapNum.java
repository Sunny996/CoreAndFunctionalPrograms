package main;

import java.util.Scanner;

public class SwapNum {
    public static void main(String[] args) {
        SwapNum swapNum = new SwapNum();
        swapNum.swap();
    }

    Scanner sc = new Scanner(System.in);
    public int a = sc.nextInt();
    public int b = sc.nextInt();

    public void swap() {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Value of a= " + a + " and b= " + b);
    }

}
