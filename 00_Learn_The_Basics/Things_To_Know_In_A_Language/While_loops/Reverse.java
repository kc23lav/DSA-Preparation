//Finding the reverse of the number entered by the user

import java.util.*;

public class Reverse
{
    
    public static void main(String args[])
    {
        int r=0;
        Scanner in=new Scanner(System.in);
        int N;
        System.out.println("Enter the number");
        N=in.nextInt();
        while(N>0)
        {
            r=r*10+(N%10);
            N=N/10;
        }

        System.out.println("The reverse of the number  is : " + r);

    }
}
