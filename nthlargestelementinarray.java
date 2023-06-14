import java.util.Arrays;
import java.util.Scanner;

public class NthLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the value of N: "); 
        int n = scanner.nextInt();
        
        int nthLargest = findNthLargestNumber(array, n);
        
        System.out.println("The " + n + "th largest number in the array is " + nthLargest);
    }
    
    public static int findNthLargestNumber(int[] array, int n) {
        Arrays.sort(array);
        int length = array.length;
        
        return array[length - n];
    }
}