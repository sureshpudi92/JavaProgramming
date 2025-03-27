package strings2;

public class StringVsStringBuilderVsStringBuffer {
    public static void main(String[] args) {
        //string is immutable-can't be changed
        String s="welcome";
        //System.out.println(s.concat(" to java")); //at run time it will concat the string
        s.concat("to java");
        System.out.println(s);// but original string is not changed

        //stringbuffer is mutable-can be changed
        StringBuffer sb=new StringBuffer("welcome");
        sb.append("to selenium");
        System.out.println(sb);//welcome to java

        //stringbuilder is mutable-can be changed
        StringBuilder sbr=new StringBuilder("welcome");
        sbr.append("to API");
        System.out.println(sbr);//welcome to java

        // concat and append methods are same but concat is used in string and append is used in stringbuffer and stringbuilder
    }
}
