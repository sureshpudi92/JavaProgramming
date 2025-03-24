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

        //3) Logical operators   &&   ||  !
        //retuns always a boolean value(tru/false)
        //works between two boolean values

        boolean x=true ,y=false;
        System.out.println(x&&y); //false
        System.out.println(x||y); //true
        System.out.println(!x); //false
        System.out.println(!y); //false

        boolean b1=a>b; //true
        System.out.println(b1);

        boolean b2=a<b; //false
        System.out.println(b2);

        System.out.println(b1 && b2); //false
        System.out.println(b1 || b2); //true

        System.out.println((10<20) && (10>20) ); //false
        System.out.println((10<20) || (10>20) ); //true

        System.out.println(!(10<20)); //false

        //4) Increment & Decrement operators  ++  --





    }
}
