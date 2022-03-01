// Swape three numbers with help of third number.
import java.util.*;
public class SwapNumber
{
    public static void main(String[] args)
    {
        int a,b,temp;
        Scanner sc=new Scanner(System.in);
        System.out.print("A = ");
        a=sc.nextInt();
        System.out.print("B = ");
        b=sc.nextInt();
        System.out.println("\n");
        System.out.println("Before Swapping");
        System.out.println("A = "+ a +"\nB = "+b+"\n");

        
        // Logic 1
        temp=a;
        a=b;
        b=temp;
        
        /*
        // Logic 2 Without third Integer
        a=a+b;
        b=a-b;
        a=a-b;
        */

        System.out.println("After Swapping");
        System.out.println("A = "+a+"\nB = "+b+"\n");   
            
    }
    
}