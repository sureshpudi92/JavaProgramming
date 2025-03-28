package polymorphism;

public class Test {

    int number;            // instance variable or class variable
    void m1(int number){   // local variable or method variable
        number=number+10;
        System.out.println("value in method "+number);
    }

    void m2(Test t){
        t.number=t.number+10;
        System.out.println("value in method "+t.number);
    }
}
