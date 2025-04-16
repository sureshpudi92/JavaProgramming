package arrays2;

import java.util.Scanner;

public class TakingMultipleInputs {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter first number:");
        int num1=sc.nextInt();

        System.out.println("enter first number:");
        int num2=sc.nextInt();
        System.out.println(num1+num2);
    }
}
