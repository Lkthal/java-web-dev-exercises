package exercises;

import java.util.Arrays;

public class ArrayDigit {
    public static void main(String[] args) {

        int[] myNum = {1, 1, 2, 3, 5, 8};
        /* Every number printing */
        for (int i = 0; i < myNum.length; i++) {
            System.out.println(myNum[i]);
        }
        /* Even printing */
        for (int i = 0; i < myNum.length; i++) {
            if (myNum[i] % 2 == 0) {
                System.out.println(myNum[i]);
            }
        }
        /* odd printing */
        for (int i = 0; i < myNum.length; i++) {
            if (myNum[i] % 2 != 0) {
                System.out.println(myNum[i]);
            }
        }

        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] str = phrase.split(" ");
        System.out.println(Arrays.toString(str));

        String[] sentences = phrase.split("\\.");
        System.out.println(Arrays.toString(sentences));

    }
}