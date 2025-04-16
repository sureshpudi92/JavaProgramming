package exceptionHandling;

import java.util.Scanner;

public class ExceptionsDemo {
    public static void main(String[] args) {

        System.out.println("program is started...............");
        Scanner sc=new Scanner(System.in);

        //example 1
        //System.out.println("enter number");
        //int num=sc.nextInt();//0
        //System.out.println(100/num); Arithmetic exception

        //example 2
        /*int a[]=new int[5];
        System.out.println("enter position 0 to 4");
        int pos=sc.nextInt();//5
        System.out.println("enter value");
        int value=sc.nextInt();
        a[pos]=value;//100  Array outer bound exception
        System.out.println(a[pos]);*/



        //example 3
        /*String s="welcome";
        int num=Integer.parseInt(s); //number format exception
        System.out.println(num);*/

        //example 4
        String s="welcome";
        String s1=null;
        System.out.println(s.length());//7
        System.out.println(s1.length());//null pointer exception

        System.out.println("program is completed...............");

    }
}
