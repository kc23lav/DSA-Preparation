// Counting digits of a number 

import java.util.*;

public class CountingDigits
{
    public static void main(String[] args)
     {
        
    int n,c=0;
    Scanner in=new Scanner(System.in);

    System.out.println("Enter the number ");
    n=in.nextInt();
    
    for(int i=n;i>0;i=i/10)
    {
        c++;
    }
    System.out.println("The number of digits is : "+c);
}
}
