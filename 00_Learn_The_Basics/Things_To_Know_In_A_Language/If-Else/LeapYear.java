//Checking whether the year entered by the user is leap year or not 

import java.util.*;


public class LeapYear
{
    public static void main(String[] args) 
    {
        Scanner in= new Scanner(System.in);
        
        System.out.println("Enter the year to be checked ");
        
        int year=in.nextInt();

        if((year % 400 ==0) || (year % 4 ==0) && (year % 100 !=0))
            System.out.println("The entered year " + year + " is a leap year");

        else 
             System.out.println("The entered year " + year + " is a not leap year");
        
    }
}
