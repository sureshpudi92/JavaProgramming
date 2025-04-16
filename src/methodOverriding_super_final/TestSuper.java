package methodOverriding_super_final;

public class TestSuper {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.display();
        d.eat();

        Dog d1=new Dog("Tommy");
    }
}
