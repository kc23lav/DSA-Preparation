// Printing a multiplication table 

import java.util.*;

public class Table
{
    public static void main(String[] args)
     {
        
    int n,m=1;
    Scanner in=new Scanner(System.in);

    System.out.println("Enter the numberwhose table you want ");
    n=in.nextInt();
    
    for(int i=1;i<=10;i++)
    {
        m=n*i;
        System.out.println(n+ " X "+i+ "= "+ m);
    }
    
}
}
