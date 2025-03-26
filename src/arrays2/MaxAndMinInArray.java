package arrays2;

public class MaxAndMinInArray {
    public static void main(String[] args) {
        int a[] = {200, 50, 60, 90, 40};

        int max = a[0]; // Assume first element is max
        int min = a[0]; // Assume first element is min

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i]; // Update max if current element is greater
            }
            if (a[i] < min) {
                min = a[i]; // Update min if current element is smaller
            }
        }

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
