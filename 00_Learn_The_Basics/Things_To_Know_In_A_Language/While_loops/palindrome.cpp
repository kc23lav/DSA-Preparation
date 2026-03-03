//Finding the whether the number entered by the user is palindrome or not 

#include<iostream>
using namespace std;

int main()
{
        int r=0,n,N;
        cout<<"Enter the number"<<endl;
        cin>>N;
        n=N;
        while(N>0)
        {
            r=r*10+(N%10);
            N=N/10;
        }

        if(n==r)
            cout<<"The number " << n << " is palindrome ";
        else
            cout<<"The number " << n << " is not  palindrome ";  

}
