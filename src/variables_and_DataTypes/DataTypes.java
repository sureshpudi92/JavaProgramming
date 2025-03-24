package variables_and_DataTypes;

public class DataTypes {
    public static void main(String[] args) {

        // Primitive data types, store only single value , starts with lower case

        int a=100; int b=200;
        System.out.println(a);
        System.out.println(b);
        System.out.println(a+b);

        byte by=120;
        System.out.println(by);

        short sh=250;
        System.out.println(sh);

        long l=1234567845234L;  //after 10 digit Literal L required at end
        System.out.println(l);

        //Decimal number-Float double

        float price=150.5f; //literal is need f or F
        System.out.println(l);

        double item_price=200.9877;
        System.out.println(item_price);

        char  grade= 'A';
        System.out.println("Student grade is "+ grade);

        boolean bool=true;
        System.out.println(bool);
        bool=false;
        System.out.println(bool);

//Note: All non primitive data types are predefined classes in java , its starts with upper case, store multiple values
        String name="suresh";


    }
}
