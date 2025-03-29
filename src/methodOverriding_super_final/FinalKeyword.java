package methodOverriding_super_final;
/*
   Final Keyword
   The final keyword in Java is used to declare constants, prevent method overriding, and inheritance.
   1. Final variable: A variable declared with the final keyword cannot be changed once it is initialized. It is a constant.
   2. Final method: A method declared with the final keyword cannot be overridden by subclasses.
   3. Final class: A class declared with the final keyword cannot be subclassed or extended.
*/



class Test {
    final int x = 100;

    final void display() {
        System.out.println(x);
    }
}

   final class Test1 extends Test{
        /*void display(){ //cannot override final method
            System.out.println(x+x);//
        }*/
    }

    /*class Test2 extends Test1{ // cannot extend final class
        void display(){
            System.out.println(x+x);//
        }
    }*/

public class FinalKeyword {
    public static void main(String[] args) {
        Test t = new Test();
        //t.x=200; // This will cause a compile-time error because x is final and cannot be changed
        System.out.println(t.x);
        t.display();



    }
}
