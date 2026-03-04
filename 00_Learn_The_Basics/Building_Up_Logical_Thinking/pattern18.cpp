#include<iostream>
using namespace std;

int main()
{
        int s = 0, n = 5;

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n-i+1; j++)
                cout<<"* ";

            for(int j = 1; j <= s; j++)
                cout<<"  ";

            for(int j = 1; j <= n-i+1; j++)
                cout<<"* ";

            s = s + 2;
            cout<<endl;
        }

        s = 2*n-2;

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
                cout<<"* ";

            for(int j = 1; j <= s; j++)
                cout<<"  ";

            for(int j = 1; j <= i; j++)
                cout<<"* ";

            s = s - 2;
            cout<<endl;
        }
}
