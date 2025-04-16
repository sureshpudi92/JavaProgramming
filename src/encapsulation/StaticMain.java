package encapsulation;


public class StaticMain {
    public static void main(String[] args) {//in static method we can call only static methods directly with out creating object
        StaticDemo.m1(); // class name required to call static method in another class
        System.out.println(StaticDemo.a); // class name required to call static variable in another class


        StaticDemo obj=new StaticDemo(); // creating object
        //obj.m2(); // non static method can be called with object
        //System.out.println(obj.b); // non static variable can be called with object

        obj.m(); // calling non static method which in turn calls static and non static methods


    }
}
