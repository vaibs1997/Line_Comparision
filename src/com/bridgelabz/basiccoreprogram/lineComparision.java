package com.bridgelabz.basiccoreprogram;

import java.util.Scanner;

public class lineComparision {
    static class LineComparison
    {
        int x1;
        int y1;
        int x2;
        int y2;

        static double LengthLine(int a1, int b1, int a2, int b2) {
            double measure;
            measure = Math.sqrt(((a2 - a1) * (a2 - a1)) + ((b2 - b1) * (b2 - b1)));
            return measure;
        }
    }

    static double lengthProcedure()
    {

        LineComparison line =  new LineComparison();
        Scanner Num = new Scanner(System.in);
        System.out.println("Enter the Co-ordinates of x1 & y1 : ");
        line.x1 = Num.nextInt();
        line.y1 = Num.nextInt();
        System.out.println("Enter the Co-ordinates of x2 & y2 : ");
        line.x2 = Num.nextInt();
        line.y2 = Num.nextInt();
        double lengthOfLineComputed =  LineComparison.LengthLine(line.x1,line.y1,line.x2,line.y2);
        System.out.println("Length of the Line is : " + lengthOfLineComputed + " Unit" );
        return lengthOfLineComputed;
    }

    static void equalsIf(double subLength1,double subLength2)
    {
        Double subLength1ForObject = subLength1;
        Double subLength2ForObject = subLength2;
        if (subLength1ForObject.equals(subLength2ForObject)) {
            System.out.println("The length of lines are equal");
        }
        else {
            System.out.println("The lines are not equal");
        }
    }

    static void comparing(double subLength1,double subLength2)
    {
        Double subLength1ForObject = subLength1;
        Double subLength2ForObject = subLength2;
        System.out.println("Comparing two lines ");
        int compare=subLength1ForObject.compareTo(subLength2ForObject);
        if (compare > 0) {
            System.out.println("first line " + subLength1ForObject + " is greater than line two " + subLength2ForObject);
        }
        else if (compare < 0) {
            System.out.println("first line " + subLength1ForObject + " is less than line two " + subLength2ForObject);
        }
        else {
            System.out.println("first line " + subLength1ForObject + " is equal to the line two " + subLength2ForObject);
        }
    }

    public static void main(String[] args) {
        double length1 = lengthProcedure();
        System.out.println("------------- For Second Line ------------");
        double length2 = lengthProcedure();
        System.out.println("------------- checking if lines are equal ------------");
        equalsIf(length1,length2);
        System.out.println("------------- Comparing two lines ------------");
        comparing(length1,length2);
    }
}
