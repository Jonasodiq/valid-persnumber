// 10 sep 2024 Jonas N Uppgift-6 Check valid personal numbers.

import java.util.Scanner;

public class Main {

    // Method to check if the personal number is valid using the Luhn algorithm
    public static boolean checkPersNum(String persNum) {
        // Remove all non-numeric characters, e.g., hyphens
        persNum = persNum.replaceAll("\\D", "");

        // Check if the personal number has exactly 10 digits
        if (persNum.length() != 10) {
            return false;
        }

        // Luhn algorithm
        int sum = 0;
        for (int i = 0; i < 9; i++) { // iterate over the first 9 digits
            int num = Character.getNumericValue(persNum.charAt(i));
            if (i % 2 == 0) { // Check if the index is even
                int multiplied = num * 2;
                if (multiplied > 9) {
                    multiplied -= 9;
                }
                sum += multiplied;
            } else {
                sum += num;
            }
        }

        // Calculate the check digit
        int checkDigit = (10 - (sum % 10)) % 10;

        // Check if the last digit matches the check digit
        return checkDigit == Character.getNumericValue(persNum.charAt(9));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continueValidation;

        do {
            // Ask the user to enter the personal number
            System.out.print("Ange ett personnummer, 10 siffror (ÅÅMMDDXXXX): ");
            String persNum = sc.nextLine();

            // Check if the personal number is valid
            if (checkPersNum(persNum)) {
                System.out.println("Personnumret är giltigt.");
            } else {
                System.out.println("Personnumret är ogiltigt.");
            }

            // Ask if the user wants to validate another personal number
            System.out.print("Vill du kontrollera ett annat personnummer? (y/n): ");
            continueValidation = sc.nextLine().toLowerCase();

        } while (continueValidation.equals("y"));

        sc.close();
    }
}

