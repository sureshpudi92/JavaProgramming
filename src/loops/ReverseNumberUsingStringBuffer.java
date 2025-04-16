package loops;

import java.util.Scanner;

public class ReverseNumberUsingStringBuffer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value:");
        int num=sc.nextInt();
        StringBuffer rev;
        StringBuffer sb=new StringBuffer(String.valueOf(num));
        rev=sb.reverse();
        System.out.println(rev);

    }
}
