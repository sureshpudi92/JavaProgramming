package polymorphism;

public class Adder {

    int a=10, b=20;
    void m1(){
        System.out.println(a+b);
    }
    void m2(int x ,int y){
        System.out.println(x+y);
    }
    void m3(double x ,double y){
        System.out.println(x+y);
    }
    void m4(int x ,double y){
        System.out.println(x+y);
    }
    void m5(double y ,int x){
        System.out.println(x+y);
    }
}
