// Printing sum of numbers from 1 to N

import java.util.*;

public class Sum
{
    public static void main(String[] args)
     {
        
    int n,s=0;
    Scanner in=new Scanner(System.in);

    System.out.println("Enter the value of n ");
    n=in.nextInt();
    
    for(int i=1;i<=n;i++)
    {
        s=s+i;
    }
    System.out.println("The sum is : "+ s);
}
}
