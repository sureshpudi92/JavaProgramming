package array1;

public class SingleDimentionalArray {
    public static void main(String[] args) {
        //1.Declaring array

        int a[]=new int[5];  //int []a=new int[5];
        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;
        a[4]=50;
       // a[5]=60; //array outer bound exception

         //2.Approach2  Declartion + adding values
        int b[]={10,20,30,40,50};

        //3.size of an Array
        System.out.println(a.length); //5

        //4.read single value from array
        System.out.println(b[2]); //30
        System.out.println(a[0]); //10

        //5.read all values from array using normal for loop
        for (int i=0;i<a.length;i++){  //for (int i=0;i<5;i++) ***imp  //for (int i=0;i<=4;i++) //for(int i=0;i<=a.length-1;i++)
            System.out.println(a[i]);
        }

        //for each loop or enhanced for loop
        for (int x:a){
            System.out.println(x);

        }




    }
}
