//Checking whether the alphabet entered is vowel or consonants 

#include<iostream>
using namespace std;

int main()
{
        char ch;

        cout<<"Enter the alphabet you want to check ";
        cin>>ch;

        switch(ch)
        {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
           cout<<"The aphabet you entered is a vowel";
            break;
        
        default:
            if(ch>='a' && ch<='z')
            cout<<"The alphabet you entered is a Consonant";
            else
            cout<<"The letter you have entered is not an alphabet";    
        
    }

 }
