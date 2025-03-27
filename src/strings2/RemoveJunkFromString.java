package strings2;

public class RemoveJunkFromString {
    public static void main(String[] args) {
        // remove junk characters from a string using regular expression
        String s="wel#$%^&*23456come";
       s= s.replaceAll("[^a-zA-Z]","");
        System.out.println(s);




    }
}
