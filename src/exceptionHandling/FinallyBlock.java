package exceptionHandling;

public class FinallyBlock {
    public static void main(String[] args) {
        System.out.println("program started...................");
        String s1=null;
        try {
            System.out.println(s1.length());//null pointer exception
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("finally block will execute always");
        }
    }
}
