package methodOverriding_super_final;
/* super keyword is used to call immediate parent class variables and methods
   super() is used to call parent class constructor(super() should be first statement in child class constructor)
   or optional(it will call parent class default constructor)
 */
public class Animal {
    String color="white";

    void eat(){
        System.out.println("Animal is eating");
    }

    Animal(){
        System.out.println("Animal constructor");
    }
    Animal(String name){
        System.out.println("Animal constructor with name: "+name);
    }

}

class Dog extends Animal{
    String color="black";
    void display(){

        System.out.println("Animal color: "+super.color);//white because it is parent class variable

    }
    void eat(){
        super.eat();
        //System.out.println("Animal is eating grass");
    }
    Dog() {
        super(); // calls parent class constructor
        //System.out.println("Dog constructor");
    }
    Dog(String name) {
        super(name); // calls parent class constructor with name
        //System.out.println("Dog constructor with name: "+name);
    }
}
