import java.util.*;

public class numberskip
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the range:"); 
    int n = s.nextInt();
    System.out.print("Enter the skipping number:");
    int num = s.nextInt();
    s.close();
    
    System.out.println("Skipped Range:");
    for(int i = 1 ; i < n ; i+=num)
    {
      System.out.print(i+", ");
    }
  }
}