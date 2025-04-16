package arrays2;

public class FindMissingNumberInArray {
    public static void main(String[] args) {
        /*a={1,4,5,3}
                * numbers should be in range
                * should not have duplicates
                * no need of sorting order

        logic:  1+2+4+5=12 (sum1)
                1+2+3+4+5=15 (sum2)
                sum2-sum1 = missing number*/

        int a[]={1,4,5,3};
        int sum1=0;
        for(int i:a){
            sum1=sum1+i; //sum1+=i
        }
        System.out.println(sum1);

        int sum2=0;
        for(int i=1;i<=5;i++){
            sum2+=i; //sum2=sum2+a[i]
        }
        System.out.println(sum2);

        System.out.println("missing number is " + (sum2-sum1));
    }
}
