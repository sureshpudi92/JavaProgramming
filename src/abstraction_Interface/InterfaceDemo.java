package abstraction_Interface;

interface shape {
     int length = 10; // by default public static final
     int width = 20; // by default public static final
    void circle(); // by default public abstract
    default void square(){
        System.out.println("This is a default method :Square");
    }
    static void rectangle(){
        System.out.println("This is a static method :Rectangle");
    }
}

public class InterfaceDemo implements shape {

    public void circle(){
        System.out.println("This is a circle");
    }

    void triangle(){
        System.out.println("This is a triangle");
    }

    public static void main(String[] args) {
        /*InterfaceDemo obj = new InterfaceDemo();
        obj.circle();   //abstract method can be called with object
        obj.square();   // default method can be called with object
        shape.rectangle(); // static method can be called with interface name
        obj.triangle(); // non static method can be called with object
        System.out.println(shape.length+shape.width);// static variable can be called with interface name
        System.out.println(obj.length+obj.width);// static variable can be called with object
*/

        //scenario 2
        shape sh = new InterfaceDemo();
        sh.circle();   //abstract method can be called with object
        sh.square();   // default method can be called with object
        //sh.rectangle(); // can not access
        shape.rectangle(); // static method can be called with interface name directly
        //sh.triangle(); // can not access


    }
}
