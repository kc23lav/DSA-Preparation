//Finding the whether the number entered by the user is palindrome or not 

import java.util.*;

public class Palindrome
{
    
    public static void main(String args[])
    {
        int r=0,n;
        Scanner in=new Scanner(System.in);
        int N;
        System.out.println("Enter the number");
        N=in.nextInt();
        n=N;
        while(N>0)
        {
            r=r*10+(N%10);
            N=N/10;
        }

        if(n==r)
            System.out.println("The number " + n + " is palindrome ");
        else
            System.out.println("The number " + n + " is not  palindrome ");  

    }
}
