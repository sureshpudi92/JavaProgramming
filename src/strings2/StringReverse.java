package strings2;

import java.util.Arrays;

public class StringReverse {
    public static void main(String[] args) {
        //Approach 1 ----- lengtch(),charAt()
        /*String s="selenium";
        String rev="";
        for (int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        System.out.println(rev);*/

        //Approach 2----Converting String to char Array
       /* String s="welcome";
        String rev="";
       char a[]= s.toCharArray();
        System.out.println(Arrays.toString(a)); //to convert an array into a string representation
        for(int i=a.length-1;i>=0;i--){
            rev=rev+a[i];
        }
        System.out.println(rev);*/

        //method 3 String Buffer

        StringBuffer sb=new StringBuffer("welcome");
        System.out.println(sb.reverse());

        //method 4 String builder
        StringBuilder s=new StringBuilder("java");
        System.out.println(s.reverse());


    }
}
