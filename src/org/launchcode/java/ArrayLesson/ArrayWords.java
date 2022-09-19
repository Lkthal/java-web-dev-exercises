package org.launchcode.java.ArrayLesson;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayWords {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Dog");
        words.add("Duck");
        words.add("Five");
        words.add("Kitty");
        words.add("Pencil");
        words.add("books");
        words.add("across");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();
        for (String word : words) {
            if(word.length() == numChars){
                System.out.println(word);
            }
        }


    }
}
