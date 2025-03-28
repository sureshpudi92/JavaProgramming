package polymorphism;

public class CallByValue {
    public static void main(String[] args) {
        Test test=new Test();
        int number=100; // local variable or method variable
        System.out.println("Before Method "+number);
        test.m1(number); // passing the value of number to method m1
        System.out.println("After Method "+number);

        /*In Java, when you pass a primitive type to a method,
          it is passed by value. This means that a copy of the variable is passed to the method,
         and any changes made to the parameter inside the method do not affect the original variable. */
    }
}
