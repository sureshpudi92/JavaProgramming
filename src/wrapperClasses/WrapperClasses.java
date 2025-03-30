package wrapperClasses;

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
