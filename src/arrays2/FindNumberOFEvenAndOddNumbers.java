package arrays2;

public class FindNumberOFEvenAndOddNumbers {
    public static void main(String[] args) {
        int a[]={10,10,5,7,8,99,10};
       int even_count=0;
       int odd_count=0;
       for(int i:a){
           if(i%2==0){
               even_count++;
           }else {
               odd_count++;
           }
       }
        System.out.println(even_count);
        System.out.println(odd_count);
    }
}
