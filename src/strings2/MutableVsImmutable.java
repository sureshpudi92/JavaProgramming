package strings2;

import java.util.Arrays;

public class MutableVsImmutable {
    public static void main(String[] args) {
        int a[]={40,20,10,3};
        int b[]=Arrays.copyOf(a,a.length); //immutable --can't change the original array
        //note: Arrays.copyOf() method is used to copy the specified array. It takes two arguments.
        // The first argument is the name of the array to be copied and the second argument is the length of the new array.
        System.out.println(Arrays.toString(a)); // [40, 20, 10, 3]
        Arrays.sort(a); //mutable --can change the original array
        System.out.println(Arrays.toString(a)); // [3, 10, 20, 40]
        System.out.println(Arrays.toString(b)); // [40, 20, 10, 3]

    }
}
