package java_operators;

public class DecrementOperator {
    public static void main(String[] args) {
         /*int a=10;
        //a=a+1;
        a--;
        System.out.println(a);   9 */

        // post decrement(******Interview Question)
        int a=10;
        int res=a--;
        System.out.println(res);  //10 because increment is happening here after storing value into varaiable.

        //pre decrement

        int b=10;
        int res2=--b;
        System.out.println(res2); //9
    }
}
