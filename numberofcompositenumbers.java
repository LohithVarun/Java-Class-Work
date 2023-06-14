public class CompositeNumbers {
    public static void main(String[] args) {
        int[] arr = {4, 7, 12, 15, 17, 21, 23, 25, 27};
        int count = 0;
        for (int i = 0; i < arr.length; i++) { 
            if (isComposite(arr[i])) {
                count++;
            }
        }
        System.out.println("Number of composite numbers in the array: " + count);
    }
    
    public static boolean isComposite(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return true;
            }
        }
        return false;
    }
}
