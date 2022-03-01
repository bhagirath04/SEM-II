//Wirte Programme to tfind largest number among three numbers.
import java.util.*;
public class LargestNum
{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        a=sc.nextInt();
        System.out.print("Enter Number 2: ");
        b=sc.nextInt();
        System.out.print("Enter Number 3: ");
        c=sc.nextInt();

        //logic
        if (a>b&&a>c)
        {
            System.out.println("The Largest Number is "+a);
        }
        else if(b>a&&b>c)
        {
            System.out.println("The Largest Number is "+b);
        }
        else
        {
            System.out.println("The Largest Number is "+c);
        }
    }    
}
