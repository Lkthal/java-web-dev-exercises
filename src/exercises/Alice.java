package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String Quote = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without " +
                "pictures or conversation?'\n";

        String UserInput;
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("What sentence would you like to see if it is available?");
        UserInput = input.next();
        if(UserInput.equals(Quote.toLowerCase())){
            System.out.println("The sentence is true");
        } else{
            System.out.println("The sentence is false");
        }
        input.close();


    }
}
