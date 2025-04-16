package strings1;

import java.util.Arrays;

public class ObjectTypeArray {
    public static void main(String[] args) {
        Object a[]=new Object[3];
        a[0]=1;
        a[1]="suresh";
        a[2]=true;
        System.out.println(Arrays.toString(a));
        for (Object x:a){
            System.out.println(x);
        }


    }
}
