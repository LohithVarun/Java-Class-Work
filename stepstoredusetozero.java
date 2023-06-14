import java.util.Scanner;

public class ReduceToZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: "); 
        int num = input.nextInt();
        
        int steps = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            steps++;
        }
        
        System.out.println("Number of steps required: " + steps);
    }
}