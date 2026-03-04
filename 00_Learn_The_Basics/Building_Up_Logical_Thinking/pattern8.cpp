#include<iostream>
using namespace std;

int main()
{
        int n = 5;


        for (int i = 1; i <= n; i++) {

            // Spaces
            for (int j = 1; j <= n - i; j++) {
                cout<<"  ";
            }

            // Stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                cout<<"* ";
            }

            cout<<endl;
        }

        for (int i = 5; i >= 1; i--) {

            // Spaces
            for (int j = n-i; j >=1; j--) {
                cout<<"  ";
            }

            // Stars
            for (int j = 2 * i - 1; j >=1; j--) {
                cout<<"* ";
            }

            cout<<endl;
        }
}
