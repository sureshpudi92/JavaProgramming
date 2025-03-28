package polymorphism;

public class CallByReference {
    public static void main(String[] args) {
        Test test=new Test();
        test.number=100; // instance variable or class variable
        System.out.println("Before Method "+test.number);
        test.m2(test); // passing the reference of object test to method m2
        System.out.println("After Method "+test.number);

        /*In Java, when you pass an object to a method,
          it is passed by reference. This means that a reference to the original object is passed to the method,
         and any changes made to the parameter inside the method affect the original object. */
    }
}
