package control_Statements;

public class NestedIfElse {
    public static void main(String[] args) {
        /*if(true){
            System.out.println(1); //output 1
        }else {
            System.out.println(2);
        }*/

        if (1==1){
            if(2==1){
                System.out.println("ABC");
            }else {
                System.out.println("123");
            }
        }else {
            if(3==3){
                System.out.println("XYZ");
            }
        }
    }
}
