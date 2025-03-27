package methodsAndConstructors;

public class ConstructorDemo {
    int x,y;
    ConstructorDemo(){ //Default Constructor

        x=10;
        y=20;

    }
    ConstructorDemo(int a,int b){ //Parameterized Constructor

        x=a;
        y=b;

    }
    void sum(){
        System.out.println("Sum is "+(x+y));
    }
    public static void main(String[] args) {

        //ConstructorDemo cd=new ConstructorDemo();
        ConstructorDemo cd=new ConstructorDemo(100,200);//can not invoke multiple constructors at a time
        cd.sum();

    }
}
