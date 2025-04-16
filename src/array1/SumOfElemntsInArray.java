package array1;

public class SumOfElemntsInArray {
    public static void main(String[] args) {
        // sum of all digits in an array
        int sum=0;
        int[]a={1,2,3,4,5};
       // approach 1
        /*for(int i=0;i<a.length;i++){
            sum+=a[i];
        }*/

        for (int i:a){
            sum+=i;
        }
        System.out.println(sum);



    }
}
