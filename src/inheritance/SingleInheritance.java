package inheritance;
/*
    Single Inheritance
    Inheritance is a mechanism in object-oriented programming
    that allows a new class to inherit properties and behaviors (methods) from an existing class(Parent)
    In Single Inheritance, a class inherits from only one parent class.
    This means that the child class can access the properties and methods of the parent class.
    It is a type of inheritance where a subclass inherits from a single superclass.
 */
class A{
    int a;
    void display(){
        System.out.println("Class A "+a);
    }
}
class B extends A{
    int b;
    void show(){
        System.out.println("Class B "+b);
    }
}
public class SingleInheritance {
    public static void main(String[] args) {

        B b=new B();
        b.a=10;
        b.b=20;
        b.display();
        b.show();

    }
}



