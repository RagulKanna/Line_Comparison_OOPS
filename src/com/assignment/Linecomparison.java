package com.assignment;

import java.util.Objects;
import java.util.Scanner;

public class Linecomparison {

    Scanner sc=new Scanner(System.in);
    public static int x1,x2,y1,y2;
    public static double length,flength,slength;

    public void getinputcalculatelength()
    {
        System.out.println("\n\ngetting two line input:");
        System.out.println("\n  for first line:");
        cordinatesinput();
        System.out.println("\n\nFor first Line");
        lengthcalculation();
        flength=length;
        System.out.print("\n  the length of the first line for the values of (x1,x2) as ("+x1+","+x2+") & (y1,y2) as ("+y1+","+y2+") is "+flength);
        System.out.println("\n  for second line:");
        cordinatesinput();
        System.out.println("\n\nFor second line");
        lengthcalculation();
        slength=length;
        System.out.print("\n  the length of the second line for the values of (x1,x2) as ("+x1+","+x2+") & (y1,y2) as ("+y1+","+y2+") is "+slength);
    }


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
        length= Math.sqrt( ( (Math.pow( ( x2-x1 ),2 ) ) + (Math.pow( ( y2-y1 ),2 ) ) ) );
    }

    public void checkequalityofline()
    {
        System.out.println("\n\nCheck the equality of line:");
        Double line1=new Double(flength);
        Double line2=new Double(slength);
        boolean equal= line1.equals(line2);
        if(equal)
            System.out.println("The endpoint of 1st line is equal to endpoint of 2nd line");
        else
            System.out.println("The endpoint of 1st line is not equal to endpoint of 2nd line");
    }

    public void usecompareTo()
    {
        System.out.println("\n\nCheck the equality of line:");
        Double line1=new Double(flength);
        Double line2=new Double(slength);
        int equal=line1.compareTo(line2);
        if(equal>0.0)
            System.out.println("The endpoint of 1st line is greater than endpoint of 2nd line");
        else if(equal<0.0)
            System.out.println("The endpoint of 1st line is lesser than endpoint of 2nd line");
        else
            System.out.println("The endpoint of 1st line is equal to endpoint of 2nd line");
    }

    public static void main(String[] args) {
        System.out.println("\n   Welcome to Line Comparison Computation Program");

        Linecomparison line= new Linecomparison();
        line.getinputcalculatelength();
        line.checkequalityofline();
        line.usecompareTo();
    }

}