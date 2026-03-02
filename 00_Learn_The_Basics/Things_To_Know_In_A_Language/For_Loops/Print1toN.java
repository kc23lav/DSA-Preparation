// Printing numbers from 1 to N

import java.util.*;

public class Print1toN
{
    public static void main(String[] args)
     {
        
    int n;
    Scanner in=new Scanner(System.in);

    System.out.println("Enter the value of n ");
    n=in.nextInt();
    System.out.println("The sequence is : ");
    for(int i=1;i<=n;i++)
    {
        System.out.println(i);
    }
  }
}
