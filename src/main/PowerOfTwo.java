package main;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        PowerOfTwo powerOfTwo = new PowerOfTwo();
        powerOfTwo.powers(Integer.parseInt(args[0]));
    }

    Scanner sc = new Scanner(System.in);

    public void powers(int N) {
        for (int i = 0; i <= N; i++) {
            if (Math.pow(2, i) <= Math.pow(2, N))
                System.out.println((int) Math.pow(2, i));
        }
    }
}
