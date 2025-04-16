package exceptionHandling;

public class ThrowKeyword {
    public static void main(String[] args) {
        System.out.println("program started...................");
        String s1=null;

        try {
            if (s1==null){
                throw new NullPointerException("Null pointer exception");
            }else {
                System.out.println(s1.length());
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }



    }
}
