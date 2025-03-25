package loops;

import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        sc.close();  // Closing scanner

        int original_number = num;
        int rev = 0;

        while (num>0) {
            rev = rev * 10 + num % 10; // Extract last digit and append
            num = num / 10;  // Remove last digit
        }

        if (original_number == rev) {
            System.out.println("Given number is a palindrome.");

        } else {
            System.out.println("Given number is not a palindrome.");
        }

    }
}
