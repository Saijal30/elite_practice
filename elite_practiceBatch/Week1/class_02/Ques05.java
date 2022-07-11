package Week1.class_02;

public class Ques05 {
    public static void main(String[] args) {

        int[] arr = { 5, 7, 2, 9, 10, 1 };
        largestSmallest(arr);
    }

    public static void largestSmallest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
            min = Math.min(arr[i], min);
        }
        System.out.println("Smallest: " + min);
        System.out.println("Largest: " + max);

    }
}
