// File: src/wrapperClasses/pack1/Test2.java
package wrapperClasses.pack1;

public class Test2 {
    public int publicVar = 1;
    protected int protectedVar = 2;
    int defaultVar = 3; // default access
    private int privateVar = 4;

    public void publicMethod() {
        System.out.println("Public method");
    }

    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    void defaultMethod() {
        System.out.println("Default method");
    }

    private void privateMethod() {
        System.out.println("Private method");
    }
}

/*
1.publicVar and publicMethod are accessible from anywhere.
2.protectedVar and protectedMethod are accessible within the same package and subclasses.
acess out side package through inheritance
3.defaultVar and defaultMethod are accessible only within the same package.
4.privateVar and privateMethod are accessible only within the Test2 class.
 */