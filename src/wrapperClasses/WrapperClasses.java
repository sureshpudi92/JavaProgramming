package wrapperClasses;
/*
Wrapper classes are used to convert primitive data types into objects.
For example, if you have an int value and you want to use it in a collection like ArrayList,
you need to convert it into an Integer object.
The wrapper classes in Java are:
1. Byte
2. Short
3. Integer
4. Long
5. Float
6. Double
7. Character
8. Boolean

 */
public class WrapperClasses {
    public static void main(String[] args) {

        //primitive
        int a = 10;
        char b = 'A';
        boolean c = true;
        double d = 10.5;

        //converting primitive to object-auto-boxing
        Integer obj1 = a; // Integer.valueOf(a);
        Character obj2 = b; // Character.valueOf(b);
        Boolean obj3 = c; // Boolean.valueOf(c);
        Double obj4 = d; // Double.valueOf(d);

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        System.out.println(obj4);

        //converting object to primitive-unboxing
        int a1 = obj1; // obj1.intValue();
        char b1 = obj2; // obj2.charValue();
        boolean c1 = obj3; // obj3.booleanValue();
        double d1 = obj4; // obj4.doubleValue();
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);
        System.out.println(d1);



    }
}
