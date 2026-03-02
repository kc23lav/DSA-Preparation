//Menu Based program depicting how switch case works 

#include<iostream>
using namespace std;

int main()
{
        int n;

        cout<<"      MENU     "<<endl;
        cout<<"1. Tea"<<endl;
        cout<<"2. Coffee"<<endl;
        cout<<"3. Juice"<<endl;
        cout<<"4. Exit"<<endl;

        cout<<"Enter your choice: "<<endl;
        cin>>n;

        switch (n) 
        {
            case 1:
                cout<<"You selected Tea";
                break;

            case 2:
                cout<<"You selected Coffee";
                break;

            case 3:
                cout<<"You selected Juice";
                break;

            case 4:
                cout<<"Thank you! Exiting...";
                break;

            default:
                cout<<"Invalid choice";
        }

    }
    
