import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 30, 40, 40, 50};
        int n = arr.length;

        int[] temp = new int[n];
        int j = 0;
 
        Arrays.sort(arr);

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];

        int[] result = new int[j];
        for (int i = 0; i < j; i++) {
            result[i] = temp[i];
        }

        System.out.println("Non-duplicate items: " + Arrays.toString(result));
    }
}