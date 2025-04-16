package polymorphism;

public class OverloadMainMethod {

    void main(int a) {

        System.out.println(a);

    }
    void  main(int a, int b) {

        System.out.println(a+b);

    }
    public static void main(String[] args) {

        OverloadMainMethod obj = new OverloadMainMethod();
        obj.main(10); // Calls the main method with one int parameter
        obj.main(10, 20); // Calls the main method with two int parameters

    }
}
