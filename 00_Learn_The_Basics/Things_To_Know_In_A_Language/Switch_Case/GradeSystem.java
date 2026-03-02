//Showing the choice of the weekday using the switch cases 

import java.util.*;

public class GradeSystem
{
    public static void main(String[] args)
    {
        char g;

        Scanner in=new Scanner(System.in);


        System.out.println("Enter the grade (A,B,C,D,F) ");
        g=in.next().charAt(0);

        switch(g)
        {
        case 'A':
            System.out.println("Excellent Performance "); 
            break;

        case 'B':
            System.out.println("Very Good Performance");  
            break;
        
         case 'C':
            System.out.println("Good Performance");  
            break;

        case 'D':
            System.out.println("Average Performance ");  
            break;

        case 'F':
            System.out.println("Fail ");  
            break;

        default:
            System.out.println("Invalid Grade ");
        
    }

 }
}
