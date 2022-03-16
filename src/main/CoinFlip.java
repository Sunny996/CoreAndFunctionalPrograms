package main;

import java.util.Scanner;

public class CoinFlip {
    public static void main(String[] args) {
        CoinFlip coinFlip = new CoinFlip();
        coinFlip.percentage();
    }

    Scanner sc = new Scanner(System.in);
    public int noOfCoinFlips = sc.nextInt();
    public int noOfHeads=0;
    public int noOfTails=0;

    public String headOrTail() {
        if (Math.random() < 0.5)
            return "Tail";
        else
            return "Head";
    }

    public void percentage() {
        if(noOfCoinFlips>0) {
            for (int i = 1; i <= noOfCoinFlips; i++) {
                switch (headOrTail()) {
                    case "Head":
                        noOfHeads++;
                        break;
                    case "Tail":
                        noOfTails++;
                        break;
                }
            }
            System.out.println("Percentage of Heads " + (noOfHeads * 100) / noOfCoinFlips);
            System.out.println("Percentage of Tails " + (noOfTails * 100) / noOfCoinFlips);
        }
        else
            System.out.println("No of Coin Flips cannot be negative or zero");
    }
}
