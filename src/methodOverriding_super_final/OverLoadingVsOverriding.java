package methodOverriding_super_final;

public class OverLoadingVsOverriding {

    class ABC{
        void m1(int a){
            System.out.println(a);
        }
        void m2(int b){
            System.out.println(b);
        }
    }

    class XYZ extends ABC{
        void m1(int a){ //overriding
            System.out.println(a*a);
        }
        void m2(int b){ //overriding
            System.out.println(b*b);
        }

        void m2(int a, int b){ //overloading
            System.out.println(a+b);
        }
    }

    public static void main(String[] args) {

        OverLoadingVsOverriding obj = new OverLoadingVsOverriding();
        XYZ x = obj.new XYZ();
        x.m1(10); // Calls the overridden method in XYZ
        x.m2(5); // Calls the overriden method in XYZ
        x.m2(5, 10); // Calls the overloaded method with two parameters

    }
}
