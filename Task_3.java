import java.util.Arrays;

public class Task_3 {
    public static void main(String[] args) {
        int[] ints = Arrays.stream(args).mapToInt(Integer::parseInt).toArray();
        findMaxIncreasingSubarray(ints);
    }

    public static void findMaxIncreasingSubarray(int[] arr) {
        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                currentLength++;
                maxLength = Math.max(maxLength, currentLength);
            } else {
                currentLength = 1;
            }
        }

        System.out.println(maxLength);
    }


}
