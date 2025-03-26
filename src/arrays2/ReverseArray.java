package arrays2;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int a[]={9,20,30,4,50};
        /*for(int i=a.length-1;i>=0;i--){
            System.out.println(a[i]);
        }*/
        //using while loop
        int i=a.length-1 ;//4
        while (i>=0){
            System.out.println(a[i]);
            i--;
        }
    }
}
