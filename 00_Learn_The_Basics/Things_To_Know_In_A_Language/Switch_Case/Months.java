//Showing the choice of the weekday using the switch cases 

import java.util.*;

public class Months
{
    public static void main(String[] args)
    {
        int  n;

        Scanner in=new Scanner(System.in);


        System.out.println("Enter the number 1-12 as per the month  ");
        n=in.nextInt();

        switch(n)
        {
        case 1:
            System.out.println("The month of your choice is January"); 
            break;

        case 2:
            System.out.println("The month of your choice is Feburary");  
            break;
        
         case 3:
            System.out.println("The month of your choice is March");  
            break;

        case 4:
            System.out.println("The month of your choice is April");  
            break;

        case 5:
            System.out.println("The month of your choice is May");  
            break;

        case 6:
            System.out.println("The month of your choice is June");  
            break;
        
        case 7:
            System.out.println("The month of your choice is July");  
            break;
        
        case 8:
            System.out.println("The month of your choice is August");  
            break;

        case 9:
            System.out.println("The month of your choice is September");  
            break;

        case 10:
            System.out.println("The month of your choice is october");  
            break;

        case 11:
            System.out.println("The month of your choice is November");  
            break;

        case 12:
            System.out.println("The month of your choice is December");  
            break;
        default:
            System.out.println("Invalid choice");
        
    }

 }
     
}
