#include<iostream>
using namespace std;

int main()
{
    int i=2,num;
    bool b=false;
    cout<<"Enter Number: ";
    cin>>num;

    //logic
    for ( i ; i < num; i++)
    {
        if(num%i==0)
        {
            b= true;
            break;
        }
    }
    if(!b)
    {
        cout<<num<<" is Prime Number.";
    }
    else
    {
        cout<<num<<" is not a Prime Number.";
    }
}