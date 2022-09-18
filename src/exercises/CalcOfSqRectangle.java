package exercises;

import java.util.Scanner;

public class CalcOfSqRectangle {
    public static void main(String[] args) {
        int height;
        int width;
        int squareArea;
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("What is the height of the rectangle");
        height = input.nextInt();
        System.out.println("What is the width of the rectangle");
        width = input.nextInt();
        input.close();

        squareArea = height * width;
        System.out.println("The surface area of the rectange is: " + squareArea);
    }
}
