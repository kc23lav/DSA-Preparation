//Printing factorial of the entered number 

import java.util.*;

public class Factorial
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int N,f=1;
        System.out.println("Enter the value of N");
        N=in.nextInt();
        int i=1;
        while(i<=N)
        {
            f=f*i;
            i++;
        }

        System.out.println("The factorial of " + N + " is " + f);
    }
}
