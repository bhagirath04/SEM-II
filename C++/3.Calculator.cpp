//Wirte Programme to Design basic Calvulator
#include<iostream>
using namespace std;

int main()
{
    double a,b,sum,div,sub,multi;
    cout<<"Enter Number 1: ";
    cin>>a;
    cout<<"Enter Number 2: ";
    cin>>b;

    // logic
    sum=a+b;
    div=a/b;
    sub=a-b;
    multi=a*b;

    cout<<"\n\n";

    // result
    cout<<"\tResult!\n";
    cout<<"Sum of two Number is: "<<sum<<endl;
    cout<<"Substract of two Number is: "<<sub<<endl;
    cout<<"Multiplication of two Number is: "<<multi<<endl;
    cout<<"divison of two Number is: "<<div<<endl;

    return 0;
}
