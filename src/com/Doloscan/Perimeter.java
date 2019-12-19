package com.Doloscan;


public class Perimeter {


    static int calculatePerimeterRectangle(int length, int width) {

        int total = 2 * (length + width);
        System.out.println("Perimeter of Rectangle is: " + total);
        return total;
    }


    static int calculatePerimeterSquare(int sideLength) {

        int total = 4 * sideLength;
        System.out.println("Perimeter of Square is: " + total);
        return total;
    }
}
