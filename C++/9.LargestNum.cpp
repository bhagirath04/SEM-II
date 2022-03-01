//Wirte Programme to tfind largest number among three numbers.
#include<iostream>
using namespace std;

int main()
{
    int a,b,c;
    
    cout<<"Enter Number 1: ";
    cin>>a;
    cout<<"Enter Number 2: ";
    cin>>b;
    cout<<"Enter Number 3: ";
    cin>>c;

    //logic
    if (a>b&&a>c)
    {
        cout<<"The Largest Number is "<<a;
    }
    else if(b>a&&b>c)
    {
        cout<<"The Largest Number is "<<b;
    }
    else
    {
        cout<<"The Largest Number is "<<c;
    }
    
    return 0;
}