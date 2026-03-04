
#include<iostream>
using namespace std;

int main()
{
       char t='E';
        for(int i=0;i<=4;i++)
        { 
            char temp=t;
            for(int j=i;j>=0;j--)
            {
                cout<<temp;
                temp++;
            }
            t--;
            cout<<endl;
        }
}
