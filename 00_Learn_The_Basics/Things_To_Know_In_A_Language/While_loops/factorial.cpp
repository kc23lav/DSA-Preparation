//Printing factorial of the entered number 

#include<iostream>
using namespace std;

int main()
{
        int N,f=1;
        cout<<"Enter the value of N"<<endl;
        cin>>N;
        int i=1;
        while(i<=N)
        {
            f=f*i;
            i++;
        }

        cout<<"The factorial of " << N << " is " << f;
}
