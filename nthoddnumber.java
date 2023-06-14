import java.util.Scanner;

public class NthOddNumber {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter the value of n: ");
      int n = input.nextInt();

      System.out.print("Enter the value of nth: ");
      int nth = input.nextInt();

      int count = 0;
      int num = 1;
 
      while (count < n) {
         if (num % 2 != 0) {
            count++;
         }
         num++;
      }

      for (int i = 1; i <= nth; i++) {
         while (num % 2 == 0) {
            num++;
         }
         num++;
      }

      System.out.println("The " + nth + "th odd number after " + n + " odd numbers is " + (num - 2));
   }
}
