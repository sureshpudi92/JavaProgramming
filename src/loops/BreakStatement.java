package loops;

public class BreakStatement {
    public static void main(String[] args) {
        /*for(int i=1;i<=10;i++){

              if (i==5){
                break;    //1 2 3 4 5
            }

            System.out.println(i);
            }*/

        for(int i=1;i<=10;i++){
            if (i==5 || i== 3 || i==7){
                continue;  //skip 5,3,7---continue use to skip based on condition
            }
            System.out.println(i);


        }
    }
}
