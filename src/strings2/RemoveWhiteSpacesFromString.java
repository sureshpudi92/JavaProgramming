package strings2;

public class RemoveWhiteSpacesFromString {
    public static void main(String[] args) {
        // remove white spaces from a string using regular expression
        String s="wel come to   selenium     java";
        System.out.println("before removing white spaces: "+s);
        s= s.replaceAll("\\s","");
        System.out.println("after removing white spaces: "+s);
    }
}
