package com.bridgelabz.basiccoreprogram;

public class lineComparision {
    public static void main(String[] args) {
        // X and Y Co-ordinates
        int X1 = 10;
        int X2 = 20;
        int Y1 = 11;
        int Y2 = 24;

        // Length of Line
        double squareOfX = Math.pow((X2-X1),2);
        double squareOfY = Math.pow((Y2-Y1),2);
        double Length_of_Line = Math.sqrt(squareOfX + squareOfY);
        System.out.println(" Length of Line: " + Length_of_Line);

    }
}
