package game;

import java.util.Random;
import java.util.Scanner;

public class numberGuessingGame {
    public static void main(String[]args) {

        Random rand= new Random();
        Scanner sc= new Scanner(System.in);

        int randomNumber= rand.nextInt( 100)+ 1;
        System.out.println("RANDOM NUMBER IS " + randomNumber);

        int tryCount= 0;
        while (true) {
            System.out.println("Enter your Guess (1-100)");

            int playerGuess = sc.nextInt();
            tryCount++;

            if (playerGuess == randomNumber) {
                System.out.println("Correct! You Win.");
                System.out.println("it took you" + tryCount + "tries");
                break;
            } else if (randomNumber>playerGuess) {
                System.out.println("Nope! The number is higher Guess again.");
            } else {
                System.out.println("Nope! The number is lower Guess again.");
            }
        }
    }
}