
#include<iostream>
using namespace std;

int main()
{
        int t;
        for(int i=1;i<=5;i++)
        {
            t=0;
            for(int j=5;j>=i;j--)
            {
                cout<< (++t) << " " ;
            }
            cout<<endl;
        }
}
