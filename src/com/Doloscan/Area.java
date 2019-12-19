package com.Doloscan;

public class Area {

    static double calculateAreaRectangle(int length, double width) {

        double total = length * width;
        System.out.println("Area of Rectangle is: " + total);
        return total;
    }

    static int calculateAreaSquare(int sideLength){

        int total = sideLength * sideLength;
        System.out.println("Area of Square is: " + total);
        return total;
    }
}
