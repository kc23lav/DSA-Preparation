// Counting digits of a number 

#include<iostream>
using namespace std;

int main()
{
    int n,c=0;

    cout<<"Enter the number "<<endl;
    cin>>n;
    
    for(int i=n;i>0;i=i/10)
    {
        c++;
    }
    cout<<"The number of digits is : " << c;
}
