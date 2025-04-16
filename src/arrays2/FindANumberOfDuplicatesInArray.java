package arrays2;

import java.util.Scanner;

public class FindANumberOfDuplicatesInArray {
    public static void main(String[] args) {
        //1.Find how many numbers repeated
        int a[]={10,10,5,7,8,99,10};
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter repeated number");

        int repeated_number=sc.nextInt();
        int number_count=0;

        for(int i:a){
            if(i==repeated_number){
                number_count++;
            }

        }
        System.out.println(number_count);
    }
}
