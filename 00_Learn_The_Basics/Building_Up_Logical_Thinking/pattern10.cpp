
#include<iostream>
using namespace std;

int main()
{
        int s;
        for(int i=1;i<=5;i++)
        {
            if(i%2==0)
                s=0;
            else
                s=1;
            for(int j=i;j>=1;j--)
            {
                cout<< s << "  ";
                s=1-s;
            }
            cout<<endl;
        }
}
