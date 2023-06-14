import java.util.*;
import java.lang.*;
public class qn9
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n,ip=0,in=0,cp=0,cn=0;
    System.out.println("Enter -1 to exit:"); 
    while((n = sc.nextInt())!=-1)
    {
      if (n>=0)
      {
        ip+=n;
        cp++;
      }
      else
      {
        in+=n;
        cn++;
      }
    }
    System.out.println("\nThe Average of positive numbers: "+(ip/cp));
    System.out.println("The Average of negative numbers: "+(in/cn));
  }
}