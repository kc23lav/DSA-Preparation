#include<iostream>
using namespace std;

int minimum(int a,int b)
{
    if(a<b)
    return a;
    else
    return b;
}

int main()
{
        int n = 4;
        int size = 2*n - 1;

        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                int top = i;
                int left = j;
                int right = size - 1 - j;
                int bottom = size - 1 - i;

                int min = minimum(minimum(top,bottom), minimum(left,right));

                cout<<(n - min) <<" ";
            }
            cout<<endl;
        }
}
