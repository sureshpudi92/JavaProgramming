package loops;

public class ForLoop {
    public static void main(String[] args) {
        //print 1 ..10
        /*for (int i=1;i<=10;i++){
            System.out.println(i);
        }*/

        //print 10...1
        /*for (int i=10;i>=1;i--){
            System.out.println(i);
        }*/

        // print even numbers from 1to 10
        /*for (int i=2;i<=10;i+=2){
            System.out.println(i);
        }*/

        // print even numbers from 1to 10 using condition
        for (int i=2;i<=10;i+=2){
            if(i%2==0) {
                System.out.println(i);
            }
        }
    }
}
