package methodsAndConstructors;

public class Greetings {
    //No params No return values

    void m1(){
        System.out.println("Hello");
    }

    //No Params Return value
    String m2(){

        return("welcome to the word");

    }

    //Takes Params no return
    void m3(String name){
        System.out.println("Hello "+name);
    }

    //Takes params and also return value
    String m4(String name){

        return("Hello "+name);
    }
}
