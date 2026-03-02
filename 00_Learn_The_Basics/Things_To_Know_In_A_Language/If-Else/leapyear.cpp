#include<iostream>
using namespace std;

int main()
{
    int year;
    cout<<"Enter the year to be checked  "<<endl;
    cin>>year;

    if((year % 400 ==0) || (year % 4 ==0) && (year % 100 !=0))
    cout<<"The entered year "<< year << " is a leap year"<< endl;

    else 
    cout<<"The entered year "<< year << " is a not leap year"<< endl;
}
