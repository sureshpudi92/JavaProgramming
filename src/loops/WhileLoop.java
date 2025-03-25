package loops;

public class WhileLoop {
    public static void main(String[] args) {

        //print 1...10
        /*int i=1; //initialization
        while (i<=10){ //condition
            System.out.println(i);
            i=i+1;   //i++;       //incrementation
        }*/

        //print Hello 10 times
        /* int i=1;
        while (i<11){
            System.out.println("Hello");
            ++i; // we can use pre increment also
        }*/

        //print even numbers from 1 to 10
        /*int i=2;
        while (i<=10){
            System.out.println(i);
             i+=2     // i=i+2;
        }*/


        // Another approach print even numbers from 1 to 10
        /*int i=1; //initialization
        while (i<=10){ //condition
            if (i%2==0) {
                System.out.println(i);
            }
            i++;
        }*/

        //print 1 to 10 numbers in decending order  10 9 8.....1
        int i=10;
        while (i>=1){
            System.out.println(i);
            i--;
        }
}
}