package exceptionHandling;

import java.util.Scanner;

public class HandleExceptions {
    public static void main(String[] args) {
        System.out.println("program started............");
        Scanner sc=new Scanner(System.in);

        System.out.println("enter number");
        int num=sc.nextInt();//0
        try {
            System.out.println(100/num);
        }catch (ArithmeticException e){
            System.out.println("Invalid data provided");
            System.out.println(e.getMessage());
        }
        System.out.println("Program completed...........");

    }
}
