//Finding the reverse of the number entered by the user

#include<iostream>
using namespace std;

int main()
{
        int r=0,N;
        cout<<"Enter the number"<<endl;
        cin>>N;
        while(N>0)
        {
            r=r*10+(N%10);
            N=N/10;
        }

        cout<<"The reverse of the number  is : " << r;

}
