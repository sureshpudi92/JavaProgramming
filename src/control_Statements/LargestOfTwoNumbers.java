package control_Statements;

public class LargestOfTwoNumbers {
    public static void main(String[] args) {

        int a=10,b=20;
        /*if(a>b){
            System.out.println(" a is largest number");
        }else {
            System.out.println("b is largest number");
        }*/

        // using ternary operator
        String largest_number=(a>b)? "a is largest number" : "b is largest number";
        System.out.println(largest_number);

    }
}
