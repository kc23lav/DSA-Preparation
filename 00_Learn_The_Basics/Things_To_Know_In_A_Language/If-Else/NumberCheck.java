//Finding whether the number entered by the user is Negative,Positive or zero 

import java.util.*;


public class NumberCheck
{
    public static void main(String[] args) 
    {
        Scanner in= new Scanner(System.in);
        
        System.out.println("Enter the number to be checked whether it is Negative ,Positive or Zero ");
        
        int n=in.nextInt();

        if(n>0)
            System.out.println("The number " + n +" is positive");

        else if(n<0)
            System.out.println("The number " + n +" is negative");
        else 
            System.out.println("The number " + n +" is zero");
        
    }
}
