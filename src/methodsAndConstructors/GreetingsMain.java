package methodsAndConstructors;

public class GreetingsMain {
    public static void main(String[] args) {
        Greetings g=new Greetings();
        g.m1();

        String s=g.m2();// System.out.println(g.m2());
        System.out.println(s);
        g.m3("Suresh");
        System.out.println(g.m4("mahesh"));

    }
}
