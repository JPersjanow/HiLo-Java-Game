package com.company;

import java.util.Scanner;
public class HiLo {
    public static void game() {
        Scanner scanner = new Scanner(System.in);
        int randNumber = (int)(Math.random() * 100 + 1);

        boolean guessed = false;
        boolean game = true;
        int counter = 0;

        while (game) {
            while (!guessed) {
                System.out.println("Guess a number between 1 and 100: ");
                int guess = scanner.nextInt();
                if (guess > randNumber) {
                    System.out.println(guess + " is too high! Try again.");
                    counter ++;
                } else if (guess < randNumber) {
                    System.out.println(guess + " is too low! Try again.");
                    counter ++;
                } else {
                    System.out.println(guess + " is correct! Took you " + counter + " tries.");
                    guessed = true;
                }
            }
            System.out.println("Want to play again? (Y/N)");
            String answer = scanner.next();

            if (answer.equalsIgnoreCase("y")) {
                guessed = false;
                counter = 0;
                randNumber = (int)(Math.random() * 100 + 1);
            } else {
                System.out.println("Thank you for playing! Goodbye.");
                scanner.close();
                game = false;
            }
        }




    }
}
