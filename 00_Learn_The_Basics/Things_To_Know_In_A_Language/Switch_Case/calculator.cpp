//Designing a basic calculator using the switch cases 

#include<iostream>
using namespace std;

int main()
{
    int n1,n2;
    cout<<"Enter the first number "<<endl;
    cin>>n1;
    cout<<"Enter the second number "<<endl;
    cin>>n2;

    char op;
    cout<<"Enter the operation you want to perform +, -,* ,/"<<endl;
    cin>>op;

    switch(op)
    {
        case '+':
            cout<<"Result : " << (n1+n2); 
            break;

        case '-':
            cout<<"Result : " <<(n1-n2);
            break;
        
         case '*':
            cout<<"Result : " << (n1*n2); 
            break;

        case '/':
            if(n2 !=0)
                cout<<"Result : " << (n1/n2); 
            else
                cout<<"Divison by zero is not allowed";
            break;
        
        default:
            cout<<"Invalid operation";
        
    }

 }
     
