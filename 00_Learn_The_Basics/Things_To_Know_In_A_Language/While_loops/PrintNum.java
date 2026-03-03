//Printing numbers from 1 to N

import java.util.*;

public class PrintNum
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int N;
        System.out.println("Enter the value of N");
        N=in.nextInt();
        System.out.println("The sequence is : ");
        int i=1;
        while(i<=N)
        {
            System.out.println(i);
            i++;
        }

    }
}
