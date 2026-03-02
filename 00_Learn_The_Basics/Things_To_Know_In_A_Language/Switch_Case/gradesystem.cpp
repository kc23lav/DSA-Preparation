//Showing the choice of the weekday using the switch cases 

#include<iostream>
using namespace std;

int main()
{
        char g;

        cout<<"Enter the grade (A,B,C,D,F) "<<endl;;
        cin>>g;

        switch(g)
        {
        case 'A':
            cout<<"Excellent Performance "; 
            break;

        case 'B':
            cout<<"Very Good Performance";  
            break;
        
         case 'C':
            cout<<"Good Performance";  
            break;

        case 'D':
            cout<<"Average Performance ";  
            break;

        case 'F':
            cout<<"Fail ";  
            break;

        default:
            cout<<"Invalid Grade ";
        
    }

 }
