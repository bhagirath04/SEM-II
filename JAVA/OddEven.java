import java.util.*;
public class OddEven
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int a;
        System.out.print("Eneter Integer Number: ");
        a=sc.nextInt();
        
        System.out.println("\n");
        //logic
        if (a%2==0)
        {
                System.out.println("Enetred Number is Even.");
        }
        else
        {
                System.out.println("Enetred Number is Odd.");
        }
    }    
}
