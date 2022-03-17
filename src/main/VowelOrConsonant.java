package main;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        VowelOrConsonant vowelOrConsonant = new VowelOrConsonant();
        vowelOrConsonant.checkAlphabet();
    }

    Scanner sc = new Scanner(System.in);
    char alphabet = sc.next().charAt(0);

    public void checkAlphabet() {
        if (Character.toLowerCase(alphabet)=='a' || Character.toLowerCase(alphabet)=='e'|| Character.toLowerCase(alphabet)=='i'
                || Character.toLowerCase(alphabet)=='o' || Character.toLowerCase(alphabet)=='u')
            System.out.println("The alphabet is a Vowel");
        else
            System.out.println("The alphabet is a consonant");
    }
}
