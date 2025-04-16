package polymorphism;

public class AdderMain {
    public static void main(String[] args) {
        Adder adder = new Adder();
        adder.m1(); // Calls the method with no parameters
        adder.m2(5, 10); // Calls the method with two int parameters
        adder.m3(5.5, 10.5); // Calls the method with two double parameters
        adder.m4(5, 10.5); // Calls the method with one int and one double parameter
        adder.m5(10.5, 5); // Calls the method with one double and one int parameter
    }
}
