public class Fibonacci {
    public static int fib(int n) {
        if (n == 0) { 
            return 0;
        }
        if (n == 1) { 
            return 1; 
        }

       
        int[] fibArr = new int[n + 1];
        fibArr[0] = 0;
        fibArr[1] = 1;

        for (int i = 2; i <= n; i++) {
            fibArr[i] = fibArr[i - 1] + fibArr[i - 2];
        }

        return fibArr[n];
    }

    public static void main(String[] args) {
       
        System.out.println(fib(2)); 
        System.out.println(fib(3));
        System.out.println(fib(4));
        System.out.println(fib(10)); 
    }
}
