package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
/*
throws keyword is used to declare checked exceptions
 */
public class CheckExceptions {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("program started");

       /* try {
            FileInputStream f=new FileInputStream("c:\\file.txt");
        }catch (FileNotFoundException e){
            System.out.println("File not found exception");
            System.out.println(e.getMessage());
        }*/

        //FileInputStream f=new FileInputStream("c:\\file.txt");
       // System.out.println(f.read());//IOException

        System.out.println("program completed");
    }
}
