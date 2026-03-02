//Finding the largest among the numbers entered by the user

import java.util.*;


public class LargestNumber2
{
    public static void main(String[] args) 
    {
        Scanner in= new Scanner(System.in);
        
        System.out.println("Enter the numbers to be compared ");
        
        int n1=in.nextInt();
        int n2=in.nextInt();

        if(n1>n2)
            System.out.println("The number " + n1 +" is greater than the number "+ n2);

        else 
            System.out.println("The number " + n2 +" is greater than the number "+ n1);
        
    }
}
