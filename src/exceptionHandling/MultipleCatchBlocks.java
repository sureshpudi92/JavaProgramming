package exceptionHandling;

public class MultipleCatchBlocks {
    public static void main(String[] args) {

        System.out.println("program started...................");
        String s1=null;
        try {
            System.out.println(s1.length());//null pointer exception
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        /*catch (ArithmeticException e) {
            System.out.println("Handled Arithmetic exception...............");
        }catch (NullPointerException e){
            System.out.println("Handled Null Pointer exception.............");
            System.out.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Handled array outbound exception");
        }*/

        System.out.println("program completed....................");

    }
}
