#include<iostream>
using namespace std;

int main()
{
    int n;
    cout<<"Enter the number to be checked whether it is even or odd "<<endl;
    cin>>n;

    if(n%2==0)
    cout<<"The number "<< n << " is even "<< endl;
    else
    cout<<"The number "<< n << " is not even "<< endl;
}
