//Showing the choice of the weekday using the switch cases 

#include<iostream>
using namespace std;

int main()
{
        int  n;

        cout<<"Enter the day u want to choose 1 for monday ....... 7 for sunday  "<<endl;
        cin>>n;

        switch(n)
        {
        case 1:
            cout<<"The day of your choice is Monday"; 
            break;

        case 2:
            cout<<"The day of your choice is Tuesday";  
            break;
        
         case 3:
            cout<<"The day of your choice is Wednesday";  
            break;

        case 4:
            cout<<"The day of your choice is Thursday";  
            break;

        case 5:
            cout<<"The day of your choice is Friday";  
            break;

        case 6:
            cout<<"The day of your choice is Saturday";  
            break;
        
        case 7:
            cout<<"The day of your choice is Sunday";  
            break;
        default:
            cout<<"Invalid choice";
        
    }

 }
     
