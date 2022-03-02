import java.util.*;
public class CheckPrimeNum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i,num;
        boolean b=false;
        System.out.print("Enter Number: ");
        num=sc.nextInt();

         //logic
        for ( i =2; i < num; i++)
        {
            if(num%i==0)
            {
                b= true;
                break;
            }
        }
        if(!b)
        {
            System.out.println("\n"+num+ " is Prime Number.");
        }
        else
        {
            System.out.println("\n"+num+ " is not a Prime Number.");
        }
           
    }    
}
