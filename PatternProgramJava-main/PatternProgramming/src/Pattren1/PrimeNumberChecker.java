package Pattren1;

import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        // Step 1: Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Step 2: Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Step 3: Check if the entered number is prime
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        // Step 4: Close the Scanner to avoid resource leaks
        scanner.close();
    }

    // Step 5: Define a method to check if a number is prime
    private static boolean isPrime(int num) {
        // Prime numbers are greater than 1
        if (num <= 1) {
            return false;
        }

        // Check for factors from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            // If the number is divisible by any other number, it's not prime
            if (num % i == 0) {
                return false;
            }
        }

        // If no factors were found, the number is prime
        return true;
    }
}

