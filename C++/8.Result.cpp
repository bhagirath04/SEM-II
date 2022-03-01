#include <iostream>
using namespace std;

int main()
{
   double a,b,c,d,e,f=30*5,total,per ;
   cout<<"Enter your MARKS out of 30"<<endl;
   cout<<"Enter your EM-II MARKS: ";
   cin>>a;
   cout<<"Enter your FEE MARKS: ";
   cin>>b;
   cout<<"Enter your FME MARKS: ";
   cin>>c;
   cout<<"Enter your FOP MARKS: ";
   cin>>d;
   cout<<"Enter your WORKSHOP MARKS: ";
   cin>>e;
   
   //logic 
   total=a+b+c+d+e;
   per=total/5;
   
   //result
   if(per>=26&&per<=30)
   {
       cout<<"Congratulations! You are passed with A Grades!";
   }
   else if (per>=21&&per<=25)
   {
       cout<<"Congratulations! You are passed with B Grades!";
   }
   else if(per>=13&&per<=20)
   {
       cout<<"Congratulations! You are passed with C Grades!";
   }
   else if (per==12)
   {
       cout<<"Congratulations! You are passed with D Grades!";
   }
   else
   {
       cout<<"Alert! You are failed and you have to give makeup test to clear subject";
   }
   
    return 0;
}