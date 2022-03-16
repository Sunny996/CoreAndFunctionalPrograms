package main;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Distance dist = new Distance();
        System.out.println("Distance from (x,y) to (0,0) "+dist.distance(dist.x, dist.y));
    }

    Scanner sc = new Scanner(System.in);
    public double x = sc.nextDouble();
    public double y = sc.nextDouble();

    public double distance(double xCoordinate, double yCoordinate) {
        return Math.sqrt(Math.pow(xCoordinate, 2) + Math.pow(yCoordinate, 2));
    }
}
