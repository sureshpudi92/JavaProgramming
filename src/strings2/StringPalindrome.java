package strings2;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.next();
        String rev="";
        for (int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        if(rev.equals(s)){
            System.out.println("Given String is palindrome");
        }else{
            System.out.println("Given string is not palindrome");
        }

    }
}
