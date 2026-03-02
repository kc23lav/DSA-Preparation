// Printing a multiplication table 

#include<iostream>
using namespace std;

int main()
{
    int n,m=1;
    cout<<"Enter the numberwhose table you want "<<endl;
    cin>>n;
    
    for(int i=1;i<=10;i++)
    {
        m=n*i;
        cout<<n << " X "<<i<< "= "<< m <<endl;
    }
    
}
