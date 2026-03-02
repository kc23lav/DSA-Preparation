//Designing a basic calculator using the switch cases 

import java.util.*;

public class Calculator
{
    public static void main(String[] args)
    {
        double n1,n2;

    Scanner in=new Scanner(System.in);

    System.out.println("Enter the first number ");
    n1=in.nextDouble();
    System.out.println("Enter the second number ");
    n2=in.nextDouble();

    System.out.println("Enter the operation you want to perform + - * / ");
    char op=in.next().charAt(0);

    switch(op)
    {
        case '+':
            System.out.println("Result : " + (n1+n2)); 
            break;

        case '-':
            System.out.println("Result : " + (n1-n2)); 
            break;
        
         case '*':
            System.out.println("Result : " + (n1*n2)); 
            break;

        case '/':
            if(n2 !=0)
                System.out.println("Result : " + (n1/n2)); 
            else
                System.out.println("Divison by zero is not allowed");
            break;
        
        default:
            System.out.println("Invalid operation");
        
    }

 }
     
}
