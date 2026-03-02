// Printing a factorial

#include<iostream>
using namespace std;

int main()
{
    int n,f=1;
    cout<<"Enter the number whose factorial you want "<<endl;
    cin>>n;
    
    for(int i=n;i>=1;i--)
    {
        f=f*i;
    }
    cout<<"Factorial of "<< n <<" is : " << f;
}
