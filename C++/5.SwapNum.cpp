// Swape three numbers with help of third number.
/*#include<iostream>
using namespace std;

int main()
{
        int a=20,b=5,temp;
        cout<<"Before Swapping\n";
        cout<<"A = " <<a<< "\nB = "<<b<<"\n";
        
        // logic
        temp=a;
        a=b;
        b=temp;
        
        cout<<"After Swapping\n";
        cout<<"A = " <<a<< "\nB = "<<b<<endl;
        return 0;
}*/

// Swape number without third number
#include<iostream>
using namespace std;



int main()
{
        int a,b;
        cout<<"First Number: ";
        cin>>a;
        cout<<"Second Number: ";
        cin>>b;
        cout<<"Before Swapping\n";
        cout<<"A = " <<a<< "\nB = "<<b<<endl;
        
        // logic
        a=a+b;
        b=a-b;
        a=a-b;
                   
        cout<<"After Swapping\n";
        cout<<"A = " <<a<< "\nB = "<<b<<endl;
        return 0;
}
