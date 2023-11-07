package com.example;

import java.util.Random;
import java.util.Scanner;

public class App {
    private Scanner scanner;

    public App() {
        this.scanner = new Scanner(System.in);
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int secretNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int attempts = 0;

        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");

        while (true) {
            try {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess == secretNumber) {
                    System.out.println("Congratulations! You guessed the number " + secretNumber + " in " + attempts + " attempts.");
                    break;
                } else if (guess < secretNumber) {
                    System.out.println("Try a higher number.");
                } else {
                    System.out.println("Try a lower number.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Please enter a valid number.");
                scanner.nextLine(); // Consume the invalid input
            }
        }

        scanner.close();
    }
}