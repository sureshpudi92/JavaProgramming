package strings2;

public class CountNoOfWordsFromString {
    public static void main(String[] args) {

        String s="welcome to java programming";
        // count number of words in a string
        // using split method
        String[] words = s.split(" ");
        System.out.println("Number of words in the string: " + words.length);
        // using for loop
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("Number of words in the string: " + (count + 1));
        // using while loop
        int i = 0;
        int wordCount = 0;
        while (i < s.length()) {
            if (s.charAt(i) == ' ') {
                wordCount++;
            }
            i++;
        }
        System.out.println("Number of words in the string: " + (wordCount + 1));

        // using regex
        String[] wordsRegex = s.split("\\s+");
        System.out.println("Number of words in the string: " + wordsRegex.length);

        // using Scanner

        /*
        Scanner sc = new Scanner(s);
        int wordCountScanner = 0;
        while (sc.hasNext()) {
            sc.next();
            wordCountScanner++;
        }

         */




    }
}
