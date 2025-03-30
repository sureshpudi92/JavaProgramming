// File: src/wrapperClasses/pack1/Test1.java
package wrapperClasses.pack1;

public class Test1 {
    public static void main(String[] args) {
        Test2 t = new Test2();
        System.out.println(t.publicVar); // Accessible
        System.out.println(t.protectedVar); // Accessible
        System.out.println(t.defaultVar); // Accessible
        // System.out.println(t.privateVar); // Not accessible

        t.publicMethod(); // Accessible
        t.protectedMethod(); // Accessible
        t.defaultMethod(); // Accessible
        // t.privateMethod(); // Not accessible
    }
}