package main;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Array2D array2D = new Array2D();
    }
    Scanner sc=new Scanner(System.in);

    int M=sc.nextInt();
    int N=sc.nextInt();
    int arr[][]=new int[M][N];
    {
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    }


}
