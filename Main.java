package Geometry.Count;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double l, r, alfRad, alfDeg, pi=3.1415;
        alfRad = 0.3;
        Scanner in = new Scanner(System.in);
        System.out.print("Input r (dalnost, km): ");
        r = in.nextDouble();
       System.out.print("Input alfDeg (angle, deg): ");
        alfDeg = in.nextDouble();
        //l = r * alfRad;
        l = r * pi * alfDeg / 180;
        System.out.println(l + " km");
        in.close();
    }
}