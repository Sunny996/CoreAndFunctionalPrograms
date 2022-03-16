package main;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PrimeFactors {
    public static void main(String[] args) {
        PrimeFactors primeFactors = new PrimeFactors();
        System.out.println("The prime factors are " + primeFactors.factors());
    }

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Set<Integer> set = new HashSet<>();

    public Set<Integer> factors() {
        for (int i = 2; i * i <= N; i++) {
            if (N % i == 0) {
                System.out.println("Number " + i);
                set.add(i);
                N /= i;
                i--;
            }
        }
        if (N > 1) {
            System.out.println("Number " + N);
            set.add(N);
        }
        return set;
    }
}
