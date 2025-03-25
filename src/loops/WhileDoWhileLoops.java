package loops;

public class WhileDoWhileLoops {
    public static void main(String[] args) {
        int i=10;

       /* while (i<=5){
            System.out.println(i);
            i++; //condition false no statements execute
        }*/

        do {
            System.out.println(i);
            i++;
        }while (i<=5);  // output: 10 first time it will execute with out checking condition



    }
}
