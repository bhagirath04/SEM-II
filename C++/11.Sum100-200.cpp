// Sum of 100-200 and divisible by 5.
#include<iostream>
using namespace std;

int main()
{
    int i,sum;
    
    //logic
    for ( i = 101; i < 200; i++)
    {
        if(i%5==0)
        {
            cout<<" "<<i;
            sum+=i;
        }
    }
    cout<<"\n The Sum is: "<<sum<<endl;
}