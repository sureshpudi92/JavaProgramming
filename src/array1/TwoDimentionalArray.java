package array1;

public class TwoDimentionalArray {
    public static void main(String[] args) {

        //1.Declaration
        int a[][]=new int[3][2];  //int []a[]=new int[3][2];  int [][]a=new int[3][2];

        //2. Assigning values
        a[0][0]=100;
        a[0][1]=200;
        a[1][0]=300;
        a[1][1]=400;
        a[2][0]=500;
        a[2][1]=600;


        int b[][]={{10,20},
                   {30,40},
                   {50,60}};


        //3.find size of an array
        System.out.println(a.length); //no of rows will return
        System.out.println(a[0].length);// no of columns will return in a particular row

        //4. read single value from 2D Array
        System.out.println(a[1][1]); //400
        System.out.println(b[2][1]); //60

        //5.Read multiple values from 2D Array
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                System.out.println(a[i][j]+" ");
            }
            System.out.println();
        }

        //6.  Enhanced for loop
        for (int x[]:b){  //x is array variable,because at a time b will take one row ,so it should store in array
            for (int y:x){
                System.out.println(y);

            }
        }


    }
}
