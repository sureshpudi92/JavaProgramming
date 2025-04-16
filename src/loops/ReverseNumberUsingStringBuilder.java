package loops;

import java.util.Scanner;

public class ReverseNumberUsingStringBuilder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value:");
        int num=sc.nextInt();
        StringBuilder rev;

        StringBuilder sbl=new StringBuilder();
        sbl.append(num);
        rev=sbl.reverse();
        System.out.println(rev);

    }
}
