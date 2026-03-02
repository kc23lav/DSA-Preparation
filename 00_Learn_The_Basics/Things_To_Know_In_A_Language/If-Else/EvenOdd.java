//Finding whether the number entered by the user is even or odd

import java.util.*;

public class EvenOdd
{
    public static void main(String[] args) 
    {
        Scanner in= new Scanner(System.in);
        
        System.out.println("Enter the number to be checked whether it is even or odd");
        
        int n=in.nextInt();

        if(n%2==0)
            System.out.println("The number " + n +" is even");

        else
            System.out.println("The number " + n +" is odd");

    }
}
