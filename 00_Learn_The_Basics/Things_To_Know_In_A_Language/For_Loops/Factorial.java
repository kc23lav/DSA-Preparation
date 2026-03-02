// Printing a factorial

import java.util.*;

public class Factorial
{
    public static void main(String[] args)
     {
        
    int n,f=1;
    Scanner in=new Scanner(System.in);

    System.out.println("Enter the number whose factorial you want ");
    n=in.nextInt();
    
    for(int i=n;i>=1;i--)
    {
        f=f*i;
    }
    System.out.println("Factorial of "+ n +" is : "+ f);
}
}
