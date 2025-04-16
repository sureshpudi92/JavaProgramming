package abstraction_Interface;

public class MultipleInheritance extends InterfaceDemo implements I1, I2 {
    //only one class can be inherited,but multiple interfaces can be implemented

    public void m1() {
        System.out.println("This is m1 method");
    }
    public void m2() {
        System.out.println("This is m2 method");
    }
    public static void main(String[] args) {
        MultipleInheritance obj = new MultipleInheritance();
        obj.m1(); // calling m1 method
        obj.m2(); // calling m2 method
        System.out.println(I1.x); // calling static variable from interface1
        System.out.println(I2.y); // calling static variable from interface2
        obj.circle();// calling from class



    }
}
