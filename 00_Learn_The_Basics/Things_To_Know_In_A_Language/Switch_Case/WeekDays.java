//Showing the choice of the weekday using the switch cases 

import java.util.*;

public class WeekDays
{
    public static void main(String[] args)
    {
        int  n;

        Scanner in=new Scanner(System.in);


        System.out.println("Enter the day u want to choose 1 for monday ....... 7 for sunday  ");
        n=in.nextInt();

        switch(n)
        {
        case 1:
            System.out.println("The day of your choice is Monday"); 
            break;

        case 2:
            System.out.println("The day of your choice is Tuesday");  
            break;
        
         case 3:
            System.out.println("The day of your choice is Wednesday");  
            break;

        case 4:
            System.out.println("The day of your choice is Thursday");  
            break;

        case 5:
            System.out.println("The day of your choice is Friday");  
            break;

        case 6:
            System.out.println("The day of your choice is Saturday");  
            break;
        
        case 7:
            System.out.println("The day of your choice is Sunday");  
            break;
        default:
            System.out.println("Invalid choice");
        
    }

 }
     
}
