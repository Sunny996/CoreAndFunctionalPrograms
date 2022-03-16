package main;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        OddOrEven oddOrEven=new OddOrEven();
        oddOrEven.checkOddEven();
    }
    Scanner sc=new Scanner(System.in);
    public int num= sc.nextInt();

    public void checkOddEven(){
        if(num%2==0)
            System.out.println("The number "+num+" is Even");
        else
            System.out.println("The number "+num+" is Odd");
    }
}
