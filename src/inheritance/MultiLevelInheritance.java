package inheritance;
/*
   MultiLevel Inheritance
   Inheritance is a mechanism in object-oriented programming
   that allows a new class to inherit properties and behaviors (methods) from an existing class(Parent)
   In MultiLevel Inheritance, a class can inherit from another class, which in turn can inherit from another class, and so on.
   This means that the child class can access the properties and methods of its parent class and its grandparent class.
   It is a type of inheritance where a subclass inherits from a superclass, which in turn inherits from another superclass.
*/
class X{
    int a;
    void display(){
        System.out.println("Class A "+a);
    }
}
class Y extends X{
    int b;
    void show(){
        System.out.println("Class B "+b);
    }
}

class  Z extends Y{
    int c;
    void print(){
        System.out.println("Class C "+c);
    }
}
public class MultiLevelInheritance {
    public static void main(String[] args) {

        Z z=new Z();
        z.a=10;
        z.b=20;
        z.c=30;
        z.display();
        z.show();
        z.print();

    }
}


