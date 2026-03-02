//Checking whether the alphabet entered is vowel or consonants 

import java.util.*;

public class AlphabetRecognition
{
    public static void main(String[] args)
    {
        char ch;

        Scanner in=new Scanner(System.in);


        System.out.println("Enter the alphabet you want to check ");
        ch=in.next().toLowerCase().charAt(0);

        switch(ch)
        {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
            System.out.println("The aphabet you entered is a vowel");
            break;
        
        default:
            if(ch>='a' && ch<='z')
            System.out.println("The alphabet you entered is a Consonant");
            else
            System.out.println("The letter you have entered is not an alphabet");    
        
    }

 }
     
}
