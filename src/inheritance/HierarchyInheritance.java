package inheritance;
/* Hierarchy Inheritance
   Inheritance is a mechanism in object-oriented programming
   that allows a new class to inherit properties and behaviors (methods) from an existing class(Parent)
   In Hierarchy Inheritance, multiple classes inherit from a single parent class.
   This means that the child classes can access the properties and methods of the parent class.
   It is a type of inheritance where multiple subclasses inherit from a single superclass.
*/
class parent {

    void display(int a) {
        System.out.println("Class Parent " + a);
    }
}
class child1 extends parent {

    void show(int b) {
        System.out.println("Class Child1 "  + b);
    }
}
class child2 extends parent {

    void print(int c) {
        System.out.println("Class Child2 " + c);
    }
}


public class HierarchyInheritance {
    public static void main(String[] args) {

        child1 c1 = new child1();
        c1.display(10);
        c1.show(20);

        child2 c2 = new child2();
        c2.display(30);
        c2.print(40);

    }
}
