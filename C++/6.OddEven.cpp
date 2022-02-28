//Wirte Programme to that Checks entered number is odd or even.
#include<iostream>
using namespace std;

int main()
{
    int a;
    cout<<"Eneter Integer Number: ";
    cin>>a;

    cout<<"\n";
    
    //logic
    if (a%2==0)
    {
        cout<<"Entered Number is Even";
    }
    else
    {
        cout<<"Enetered Number is Odd.";
    }

    
    return 0;    
}
