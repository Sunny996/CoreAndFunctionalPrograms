package main;

import java.util.Scanner;

public class SumOfIntEqualsZero {
    public static void main(String[] args) {
        SumOfIntEqualsZero sumOfIntEqualsZero = new SumOfIntEqualsZero();
        System.out.println("Number of Distinct Triplets "+sumOfIntEqualsZero.distinctTriplets());
    }
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int[] integerArray=new int[N];
    int noOfTriplets=0;

    {
        for (int i=0;i<N;i++) {
            integerArray[i] = sc.nextInt();
        }
    }

    public int distinctTriplets(){
        for(int i=0;i<N; i++){
            for (int j=i+1;j<N;j++){
                for(int k=j+1;k<N;k++){
                    if(integerArray[i]+integerArray[j]+integerArray[k]==0){
                        System.out.println(i+" "+j+" "+k+" "+integerArray[i]+" "+integerArray[j]+" "+integerArray[k]);
                        noOfTriplets++;
                    }
                    else
                        System.out.println("No distinct triplets");
                }
            }
        }
        return noOfTriplets;
    }
}
