package com.assignment;

import java.util.Scanner;

public class Linecomparison {

    Scanner sc=new Scanner(System.in);
    public static int x1,x2,y1,y2;

    public void cordinatesinput()
    {
        System.out.println("\n\nGet input of x1, x2, y1, y2");
        System.out.println("\n  x1 value:");
        x1=sc.nextInt();
        System.out.println("\n  x2 value:");
        x2=sc.nextInt();
        System.out.println("\n  y1 value:");
        y1=sc.nextInt();
        System.out.println("\n  y2 value:");
        y2=sc.nextInt();
    }

    public void lengthcalculation()
    {
        System.out.println("\n\nCalcuate Length of the line:");
        double length= Math.sqrt( ( (Math.pow( ( x2-x1 ),2 ) ) + (Math.pow( ( y2-y1 ),2 ) ) ) );
        System.out.println("\n  the length of the line for the values of (x1,x2) as ("+x1+","+x2+") & (y1,y2) as ("+y1+","+y2+") is "+length);
    }

    public static void main(String[] args) {
        System.out.println("\n   Welcome to Line Comparison Computation Program");

        Linecomparison line= new Linecomparison();
        line.cordinatesinput();
        line.lengthcalculation();
    }
}
