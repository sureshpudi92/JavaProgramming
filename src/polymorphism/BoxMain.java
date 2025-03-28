package polymorphism;

public class BoxMain {
    public static void main(String[] args) {
        //Box b=new Box(); // 1.default constructor
        //Box b=new Box(10.5,20.5,30.5); // 2.parameterized constructor
        Box b=new Box(10.5); // 3.constructor with one parameter
        System.out.println( "Volume of Box with default constructor: " + b.volume());
    }




}
