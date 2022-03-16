package main;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        LeapYear leapYear = new LeapYear();
        leapYear.leapYearCheck();
    }
    Scanner sc = new Scanner(System.in);
    public int year = sc.nextInt();

    public boolean fourDigitNumCheck() {
        if (year / 1000 < 10)
            return true;
        return false;
    }
    public void leapYearCheck(){
        if(fourDigitNumCheck()){
            if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
                System.out.println("The year "+ year+" is a leap Year");
            else
                System.out.println("The year "+ year+" is not a leap Year");
        }
        else
            System.out.println("Not a 4 digit number");
    }
}
