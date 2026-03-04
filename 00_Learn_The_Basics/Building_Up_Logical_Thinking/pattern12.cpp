
#include<iostream>
using namespace std;

int main()
{
        int t=1;
        for(int i=1;i<=5;i++)
        {
            for(int j=i;j>=1;j--)
            {
                cout<<t << " ";
                ++t;
            }
            cout<<endl;
        }
}
