#include<iostream>
using namespace std;

int main()
{
    int n1, n2,n3;
    cout<<"Enter the numbers to be compared "<<endl;
    cin>>n1>>n2>>n3;

    if(n1>n2 && n1>n3)
    cout<<"The number "<< n1 << " is greater than the number "<< n2 << " and the numebr "<< n3 << endl;
    else if(n2>n1 && n2>n3)
    cout<<"The number "<< n2 << " is greater than the number "<< n1 << " and the numebr "<< n3 << endl;
    else
    cout<<"The number "<< n3 << " is greater than the number "<< n1 << " and the numebr "<< n2 << endl;
   
}
