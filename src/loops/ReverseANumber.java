package loops;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        /*1) Reverse a number (  %   / =   operators   )
        input 1234
        output 4321*/

        Scanner sc =new Scanner(System.in);
        System.out.println("enter number:");
        int num=sc.nextInt(); //1234

       // 1. using algorithm
         /* num % 10 extracts the last digit of num.
            rev * 10 shifts the digits of rev left by one place.
             The extracted digit is then added to rev. */
        int rev=0;
        while(num>0){
            rev=rev*10+num%10;
            num=num/10;

        }
        System.out.println(rev);

        /* explanation
Iteration 1:
num % 10 → 4 (Extract last digit)

rev = 0 * 10 + 4 → 4

num = 1234 / 10 → 123

Iteration 2:
num % 10 → 3

rev = 4 * 10 + 3 → 43

num = 123 / 10 → 12

Iteration 3:
num % 10 → 2

rev = 43 * 10 + 2 → 432

num = 12 / 10 → 1

Iteration 4:
num % 10 → 1

rev = 432 * 10 + 1 → 4321

num = 1 / 10 → 0 (Loop terminates)
                            */
    }
}
