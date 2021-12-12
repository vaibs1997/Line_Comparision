package com.bridgelabz.basiccoreprogram;

public class lineComparision {
    public static void main(String[] args) {
        // X and Y Co-ordinates
        // Line 1
        int X1 = 10;
        int X2 = 20;
        int Y1 = 11;
        int Y2 = 24;

        // Line 2
        int A1 = 25;
        int A2 = 12;
        int B1 = 17;
        int B2 = 29;

        // Length of Line 1
        double squareOfX = Math.pow((X2-X1),2);
        double squareOfY = Math.pow((Y2-Y1),2);
        double Length_of_Line1 = Math.sqrt(squareOfX + squareOfY);
        System.out.println(" Length of Line1: " + Length_of_Line1);

        // Length Of Line 2
        double squareOfA = Math.pow((A2-A1),2);
        double squareOfB = Math.pow((B2-B1),2);
        double Length_of_Line2 = Math.sqrt(squareOfA + squareOfB);
        System.out.println(" Length of Line2: " + Length_of_Line2);

        // Equality Comparison
        if (Length_of_Line1 == Length_of_Line2)
            System.out.println(" Length is Equal ");
        else
            System.out.println(" Length is not Equal ");


    }
}
