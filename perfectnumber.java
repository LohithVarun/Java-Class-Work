import java.util.*;
import java.lang.*;
public class qn7
{
  static boolean isPerfectNumber(int ni)  
  {   
    int s = 1;  
    for (int i = 2; i * i <= ni; i++)  
    {  
      if (ni % i==0)  
      {  
        if(i * i != ni)  
          s = s + i + ni / i;  
        else  
          s = s + i;  
      }
    }
    if (s == ni && ni != 1) 
      return true; 
    return false;  
  } 
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("N = ");
    int n = sc.nextInt(),i=0;
    System.out.print("\nFirst "+n+" Perfect Numbers are: ");
    while(n!=0)
    {
      if(isPerfectNumber(i))
      {
        System.out.print(i+", ");
        n--;
      }
      i++;
    }
  }
}