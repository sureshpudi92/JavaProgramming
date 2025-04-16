// File: src/wrapperClasses/pack2/Test3.java
package wrapperClasses.pack2;

import wrapperClasses.pack1.Test2;

public class Test3 extends Test2 {
    public static void main(String[] args) {
        Test3 t = new Test3();
        System.out.println(t.publicVar); // Accessible
        System.out.println(t.protectedVar); // Accessible
        // System.out.println(t.defaultVar); // Not accessible
        // System.out.println(t.privateVar); // Not accessible

        t.publicMethod(); // Accessible
        t.protectedMethod(); // Accessible
        // t.defaultMethod(); // Not accessible
        // t.privateMethod(); // Not accessible
    }
}