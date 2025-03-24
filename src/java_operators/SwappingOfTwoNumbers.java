package java_operators;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SwappingOfTwoNumbers {
    public static void main(String[] args) {
        int a=10,b=20,c;
        System.out.println("before swapping values of a and b is "+a+" "+b);
        //logic 1--using third variable
  /*      c=a;
        a=b;
        b=c;


        //logic 2  use + & - with out using third variable
        a=a+b; //30
        b=a-b; //10
        a=a-b; //20

        //logic 3 use * and / with out using third variable
      // note: a and values should not be zero
        a=a*b; //10*20=200
        b=a/b; //200/20=10
        a=a/b; //200/10=20*/

        //logic 4 use bitwise XOR operator(^)
        //10-binary value in decimal is 1010, 20-10100
   /*     a = a ^ b; //10 ^ 20=30
          b = a ^ b; //30 ^ 20=10
          a = a ^ b; //30 ^ 10=20  */

        //logic 5-single statement
        //a=10 b=20
       // b=a+b-(a=b);
        //<-------------------execution from right to left

        //logic 6--array
        /*int[] arr = {a, b};
        arr = new int[]{arr[1], arr[0]};

        a = arr[0];
        b = arr[1];*/

        //logic 7 --list
        List<Integer> list = Arrays.asList(a, b);
        Collections.swap(list, 0, 1);

        a = list.get(0);
        b = list.get(1);







        System.out.println("After swapping values of a and b is " +a+ " "+b);





    }
}
