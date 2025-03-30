package typeCasting;

class Parent{
    String name="suresh";
    void  m1(){
        System.out.println("Child class method");
    }
}

class  Child extends Parent{
    int x=100;
    void m2(){
        System.out.println("parent class method");
    }
}

public class TypeCastingObjects1 {
    public static void main(String[] args) {
        //normal
        /*Child c=new Child();
        System.out.println(c.name);
        c.m1();
        System.out.println(c.x);*/

        // Upcasting
        Parent p = new Child();
        System.out.println(p.name); // Accessing Parent class field
        p.m1(); // Accessing Parent class method
        // p.m2(); // Not accessible, as p is of type Parent
        //System.out.println(p.x); // Not accessible, as p is of type Parent

        // Downcasting
        if (p instanceof Child) {
            Child c = (Child) p;
            System.out.println(c.name); // Accessing Parent class field
            c.m1(); // Accessing Parent class method
            System.out.println(c.x); // Accessing Child class field
            c.m2(); // Accessing Child class method
        }

    }
}
