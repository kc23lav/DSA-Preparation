//Showing the choice of the weekday using the switch cases 

#include<iostream>
using namespace std;

int main()
{
        int  n;
        
        cout<<"Enter the number 1-12 as per the month  ";
        cin>>n;

        switch(n)
        {
        case 1:
            cout<<"The month of your choice is January"; 
            break;

        case 2:
            cout<<"The month of your choice is Feburary";  
            break;
        
         case 3:
            cout<<"The month of your choice is March";  
            break;

        case 4:
            cout<<"The month of your choice is April";  
            break;

        case 5:
            cout<<"The month of your choice is May";  
            break;

        case 6:
            cout<<"The month of your choice is June";  
            break;
        
        case 7:
            cout<<"The month of your choice is July";  
            break;
        
        case 8:
            cout<<"The month of your choice is August";  
            break;

        case 9:
            cout<<"The month of your choice is September";  
            break;

        case 10:
            cout<<"The month of your choice is october";  
            break;

        case 11:
            cout<<"The month of your choice is November";  
            break;

        case 12:
            cout<<"The month of your choice is December";  
            break;
        default:
            cout<<"Invalid choice";
        
    }

 }
