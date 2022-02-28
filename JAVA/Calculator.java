import java.util.*;
public class Calculator
{
    public static void main(String[] args)
    {
    double a,b,sum,div,multi,sub;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number 1: ");
    a=sc.nextInt();
    System.out.print("Enter Number 2: ");
    b=sc.nextInt();

    //logic
    sum=a+b;
    div=a/b;
    multi=a*b;
    sub=a-b;

    System.out.println("\n");
    //result
    System.out.println("\tResult!");
    System.out.println("Sum of two Number is: "+sum);
    System.out.println("Substract of two Number is: "+sub);
    System.out.println("Multiplication of two Number is: "+multi);
    System.out.println("Division of two Number is: "+div);
    }
}
