
#include<iostream>
using namespace std;

int main()
{  
        for(int i=1;i<=5;i++)
        { 
            char ch='A';
            for(int j=i;j>=1;j--)
            {
                cout<<ch<< " ";
                ++ch;
            }
            cout<<endl;
        }
}
