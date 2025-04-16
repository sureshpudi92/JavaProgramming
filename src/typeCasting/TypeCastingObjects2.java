package typeCasting;
/*
Typecasting Rules in Java
Rule 1: Conversion Validity
The types involved in the conversion must have some relationship (either parent to child, child to parent, or the same type).

Rule 2: Assignment Validity
The target type must be either the same as or a subclass of the source type.

Rule 3: Underlying Object Type
The underlying object type of the source must be either the same as or a subclass of the target type.
 */
class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}




public class TypeCastingObjects2 {
    public static void main(String[] args) {
        // Rule 1: Conversion Validity
        Animal an = new Dog();
        // Cat ct = (Cat) an;  // Invalid as per Rule 1

        // Rule 2: Assignment Validity
        // Animal an = new Dog();
        // Cat ct = (Cat) an;  // Invalid as per Rule 2

        // Rule 3: Underlying Object Type
        // Animal an = new Dog();
        // Cat ct = (Cat) an;  // Invalid as per Rule 3

        // Valid typecasting
        Animal an2 = new Dog();
        Dog dg = (Dog) an2;  // Rule 1: Yes, Rule 2: Yes, Rule 3: Yes





    }
}
