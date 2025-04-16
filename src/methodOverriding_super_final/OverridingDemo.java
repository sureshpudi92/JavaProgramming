package methodOverriding_super_final;
/*
   Method Overriding
   Method overriding is a feature of object-oriented programming that allows a subclass to provide a specific implementation of a method that is already defined in its superclass.
   When a subclass overrides a method, it provides its own implementation of the method, which can be different from the implementation in the superclass.
   This allows for dynamic polymorphism, where the method that is called is determined at runtime based on the actual object type.
*/

class Bank{
    double interestRate(){
        return 0.0;
    }
}
class ICICI extends Bank{
    double interestRate(){
        return 7.0;
    }
}
class SBI extends Bank{
    double interestRate(){
        return 6.5;
    }
}
public class OverridingDemo {
    public static void main(String[] args) {

        ICICI i=new ICICI();
        System.out.println(i.interestRate());

        SBI s=new SBI();
        System.out.println(s.interestRate());

    }
}
/*
Method Overriding:
1.possible only with multiple classes(subclass and superclass)
2. method name, return type and parameters should be same in both classes but
   the implementation of the method in the subclass can be different from the implementation in the superclass.
3.Belongs to inheritance and runtime polymorphism or dynamic polymorphism.

Method Overloading:
1. possible within a single class or multiple classes
2.method name should be same but the parameters should be different .
3.Belongs to compile time polymorphism or static polymorphism.

*/