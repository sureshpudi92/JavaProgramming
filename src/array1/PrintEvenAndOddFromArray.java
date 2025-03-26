package array1;

public class PrintEvenAndOddFromArray {
    public static void main(String[] args) {
        int a[]={1,4,5,8,9,3,};
        int even_count=0;
        int odd_count =0;
        for (int i:a){
            if(i%2==0){
                even_count++;

            }else{
                odd_count++;
            }
        }
        System.out.println(even_count);
        System.out.println(odd_count);


    }
}
