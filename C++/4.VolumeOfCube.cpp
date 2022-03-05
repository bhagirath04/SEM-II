//Wirte Programme to calculate the volume of cube.
#include<iostream>
using namespace std;

int main()
{
    double a,vol;
    cout<<"Enter Length of cube A: ";
    cin>>a;

    //logic
    vol=a*a*a;

    cout<<"\n";
    //result
    cout<<"Volume of Cube of Length"<<a<<":"<<vol;

    return 0;
}
