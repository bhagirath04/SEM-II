import java.util.*;
public class CheckPositive
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int a;
        System.out.print("Eneter Integer Number: ");
        a=sc.nextInt();
        
        System.out.println("\n");
        
        //logic
        if (a>=0)
        {
                System.out.println("Enetred Number is Positive.");
        }
        else
        {
                System.out.println("Enetred Number is Nagative.");
        }
    }    
}
