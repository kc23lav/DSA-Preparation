//Finding the largest among the numbers entered by the user

import java.util.*;


public class LargestNumber3
{
    public static void main(String[] args) 
    {
        Scanner in= new Scanner(System.in);
        
        System.out.println("Enter the numbers to be compared ");
        
        int n1=in.nextInt();
        int n2=in.nextInt();
        int n3=in.nextInt();

        if(n1>n2 && n1>n3)
            System.out.println("The number " + n1 +" is greater than the number "+ n2 +" and the number " +n3);

        else if(n2>n1 && n2>n3)
             System.out.println("The number " + n2 +" is greater than the number "+ n1 +" and the number " +n3);

        else 
            System.out.println("The number " + n3 +" is greater than the number "+ n1 +" and the number " +n2);
        
    }
}
