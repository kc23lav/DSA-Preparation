//Menu Based program depicting how switch case works 

import java.util.*;

public class MenuBased
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        
        System.out.println("      MENU     ");
        System.out.println("1. Tea");
        System.out.println("2. Coffee");
        System.out.println("3. Juice");
        System.out.println("4. Exit");

        System.out.print("Enter your choice: ");
        int n=in.nextInt();

        switch (n) 
        {
            case 1:
                System.out.println("You selected Tea");
                break;

            case 2:
                System.out.println("You selected Coffee");
                break;

            case 3:
                System.out.println("You selected Juice");
                break;

            case 4:
                System.out.println("Thank you! Exiting...");
                break;

            default:
                System.out.println("Invalid choice");
        }

        in.close();
    }
}
    
