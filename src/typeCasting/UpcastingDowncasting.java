package typeCasting;
/*
Upcasting: Converting from smaller to larger data type.
Ex: int to long
float to double

Downcasting: Converting from larger to smaller data type.
 Ex: long to int
 double to float
Upcasting and downcasting are terms used in programming languages to describe the conversion of data types, particularly in the context of object-oriented programming and inheritance.
 */

public class UpcastingDowncasting {
    public static void main(String[] args) {
//Upcasting: Converting from smaller to larger data type.
      int intvalue= 10;
        long longvalue= intvalue; //upcasting
        System.out.println("Upcasting: int to long: " + longvalue);

        float floatvalue= 10.5f;
        double doublevalue= floatvalue; //upcasting
        System.out.println("Upcasting: float to double: " + doublevalue);

        // Downcasting: Converting from larger to smaller data type.
        long longValue = 100000000L;
        int intValue =(int)longValue;
        System.out.println("Downcasting: long to int: " + intValue);

        double doubleValue = 125.55;
        float floatValue = (float) doubleValue; //downcasting
        System.out.println("Downcasting: double to float: " + floatValue);


        //upcasting
        int x=100;
        double d=x; //upcasting
        System.out.println(d);//100.0

        //downcasting
        double d1=100.5;
        int x1=(int)d1; //downcasting
        System.out.println(x1);//100 loss of value


    }
}
