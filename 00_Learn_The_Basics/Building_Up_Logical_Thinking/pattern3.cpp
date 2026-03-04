
#include<iostream>
using namespace std;

int main()
{
        int t=0;
        for(int i=1;i<=5;i++)
        {
            ++t;
            for(int j=1;j<=i;j++)
            {
                cout<< t <<" ";
            }
            cout<<endl;
        }
}
