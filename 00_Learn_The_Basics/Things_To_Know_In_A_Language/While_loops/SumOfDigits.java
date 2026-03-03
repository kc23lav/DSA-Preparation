//Finding the sum of digits of the number entered by the user 

import java.util.*;

public class SumOfDigits
{
    
    public static void main(String args[])
    {
        int s=0;
        Scanner in=new Scanner(System.in);
        int N;
        System.out.println("Enter the number");
        N=in.nextInt();
        while(N>0)
        {
            s=s+(N%10);
            N=N/10;
        }

        System.out.println("The sum of the digits is : " + s);

    }
}
