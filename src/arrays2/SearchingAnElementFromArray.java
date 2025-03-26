package arrays2;

import java.util.Scanner;

public class SearchingAnElementFromArray {
    public static void main(String[] args) {
        int a[]={1,4,5,7,8,99,3};
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter search number");

        int search_number=sc.nextInt();
        boolean status=false;
        for (int i:a){
            if(search_number==i){
                System.out.println("Number matched");
                status=true;
                break;
            }
        }
        if(status==false){
            System.out.println("number not matched");
        }

    }
}
