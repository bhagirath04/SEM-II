# include <iostream>
using namespace std;

int main()
{

    char op;
    float num1, num2;

    cout << "Enter operator: +, -, *, /: ";
    cin >> op;

    cout << "Enter Number 1: ";
    cin >> num1 ;
    cout << "Enter Number 2: ";
    cin >> num2 ;


    //Logic
    switch(op)
    {

        case '+':
            cout << num1 << " + " << num2 << " = " << num1 + num2;
            break;

        case '-':
            cout << num1 << " - " << num2 << " = " << num1 - num2;
            break;

        case '*':
            cout << num1 << " * " << num2 << " = " << num1 * num2;
            break;

        case '/':
            cout << num1 << " / " << num2 << " = " << num1 / num2;
            break;

        default:
            cout << "Error! operator is not Listed :(";
            break;
    }

    return 0;
}