import java.util.*;
import java.lang.*;
public class qn10
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter * to exit: ");
    char s;
    int lc=0,uc=0,n=0;
    while(true)
    {
      s = sc.next().charAt(0);
      if(s=='*') 
        break;
      char c = s;
      if(Character.isLowerCase(c))
        lc++;
      else if(Character.isUpperCase(c))
        uc++;
      else if(Character.isDigit(c))
        n++;
    }
    System.out.println("Total no of lowercase count: "+lc);
    System.out.println("Total no of uppercase count: "+uc);
    System.out.println("Total no of number count: "+n);
  }
}