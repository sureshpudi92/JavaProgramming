package java_operators;

public class Operators {
    public static void main(String[] args) {
        //1) Arithmetic operators   + - * / %
        int a=20, b=10;
       // int c=a+b;
        System.out.println("sum of a and b is " +(a+b));
        System.out.println("diff of a and b is " +(a-b));
        System.out.println("mul of a and b is " +(a*b));
        System.out.println("division of a and b is " +(a/b));
        System.out.println("modulo div of a and b is " +(a%b));

        //2) Relational/comparison operators  >  >=  <  <=  !=  ==
        //retuns always a boolean value(tru/false)
        System.out.println(a>b);  //true
        System.out.println(a>=b);
        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(a!=b);
        System.out.println(a==b);

    }
}
