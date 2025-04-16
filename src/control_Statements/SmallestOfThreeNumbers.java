package control_Statements;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        int a=5 ,b=10,c=15;
        if(a<b && a<c){
            System.out.println("a is smallest");
        } else if (b<a && b<c) {
            System.out.println("b is the smallest");

        }else
            System.out.println("c is the smallest");
    }
}
