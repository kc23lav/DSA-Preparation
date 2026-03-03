//Finding the sum of digits of the number entered by the user 

#include<iostream>
using namespace std;

int main()
{
        int s=0, N;
        cout<<"Enter the number"<<endl;
        cin>>N;
        while(N>0)
        {
            s=s+(N%10);
            N=N/10;
        }

        cout<<"The sum of the digits is : " << s;

}
