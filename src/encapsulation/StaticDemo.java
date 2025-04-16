package encapsulation;
/*
Static variable and static method can be called directly with out creating object
Non static variable and non static method can be called with object

 */
public class StaticDemo {
   static int a=10; // static variable
    int b=20; //non static variable
    static void m1(){
        System.out.println("Static method m1");
    }
    void m2(){
        System.out.println("Non static method m2");
    }
    void m(){// In non static method we can call both static and non static methods directly with out creating object
        m1();
        m2();
        System.out.println(a);
        System.out.println(b);
    }


    /*public static void main(String[] args) {//in static method we can call only static methods directly with out creating object
        //m1(); // static method can be called directly with out creating object
        //System.out.println(a); // static variable can be called directly with out creating object
        StaticDemo obj=new StaticDemo(); // creating object
        //obj.m2(); // non static method can be called with object
        //System.out.println(obj.b); // non static variable can be called with object

        obj.m(); // calling non static method which in turn calls static and non static methods


    }*/







}
