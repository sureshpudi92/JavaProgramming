package arrays2;

import java.util.Arrays;

public class SortElementsInArray {
    public static void main(String[] args) {

        int a[]={9,20,30,4,50};
        //sorting numbers
        System.out.println("Before sorting "+Arrays.toString(a)); //9,20,30,4,50
        Arrays.sort(a);
        System.out.println("After sorting "+Arrays.toString(a)); //4,9,20,30,50

        String names[]={"suresh","pudi","Bhavani"};
        System.out.println("Before sorting "+Arrays.toString(names));
        Arrays.sort(names);
        System.out.println("After sorting "+Arrays.toString(names));

    }
}
