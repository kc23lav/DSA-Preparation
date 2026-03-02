#include<iostream>
using namespace std;

int main()
{
    int n;
    cout<<"Enter the number to br checked whether it is positive , negative or zero "<<endl;
    cin>>n;

    if(n<0)
    cout<<"The number "<< n << " is negative"<< endl;
    else if(n>0)
    cout<<"The number "<< n << " is positive "<< endl;
    else
    cout<<"The number "<< n << " is zero "<< endl;
   
}
