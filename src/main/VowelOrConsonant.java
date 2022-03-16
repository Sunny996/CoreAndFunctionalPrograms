package main;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        VowelOrConsonant vowelOrConsonant = new VowelOrConsonant();
        vowelOrConsonant.checkAlphabet();
    }

    Scanner sc = new Scanner(System.in);
    String alphabet = sc.next();

    public void checkAlphabet() {
        if (alphabet.equalsIgnoreCase("a") || alphabet.equalsIgnoreCase("e") || alphabet.equalsIgnoreCase("i")
                || alphabet.equalsIgnoreCase("o") || alphabet.equalsIgnoreCase("u"))
            System.out.println("The alphabet is a Vowel");
        else
            System.out.println("The alphabet is a consonant");
    }
}
