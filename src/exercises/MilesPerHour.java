package exercises;

import java.util.Scanner;

public class MilesPerHour {
    public static void main(String[] args) {
        Double miles;
        Double gallon;
        Double MilesPerGal;
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        miles = input.nextDouble();
        System.out.println("What is the amount of gas consume?");
        gallon = input.nextDouble();
        input.close();

        MilesPerGal = miles / gallon;
        System.out.println("Your car's mgp is: " + MilesPerGal +"miles per gallon.");
    }
}
