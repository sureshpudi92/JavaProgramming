package strings2;

public class CountNoOfCharacterOccurenceFromString {
    public static void main(String[] args) {
        String s="java programming";
        /*int total_length=s.length();
        int fter_remove_space=s.replace("a","").length();
        int count=total_length-fter_remove_space;
        System.out.println(count);*/

        int count = 0;
        for (int i = 0; i <= s.length() - 1; i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println(count);


    }



}
