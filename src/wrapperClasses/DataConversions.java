package wrapperClasses;

public class DataConversions {
    public static void main(String[] args) {

        //Scenario 1----------String to primitive(unboxing)
        //String to integer
       /* String s="welcome"; //can not convert to int
        String s1="10";
        String s2="20";
        int sum=Integer.parseInt(s1)+Integer.parseInt(s2);
        System.out.println(sum);*/ //30

        /*String  s1="10.5";
        String s2="20.5";
        double sum=Double.parseDouble(s1)+Double.parseDouble(s2);
        System.out.println(sum); //31.0*/

        //String to boolean
       /* String s="true";
        Boolean b=Boolean.parseBoolean(s);
        System.out.println(b);*/

        //String to Char-------------can not convert String to char

        //Scenario 2----------primitive to String(auto-boxing)
        int a=10;
        String s=String.valueOf(a); //Integer.toString(a);
        System.out.println(s);

        double d=10.5;
        String s1=String.valueOf(d); //Double.toString(d);
        System.out.println(s1);

        boolean b=true;
        String s2=String.valueOf(b); //Boolean.toString(b);
        System.out.println(s2);

        char c='A';
        String s3=String.valueOf(c); //Character.toString(c);
        System.out.println(s3);


        //Scenario 3
        int x=10;
        double dd=x;
        System.out.println(dd);//double will accept int value but int will not accept double value




    }
}
