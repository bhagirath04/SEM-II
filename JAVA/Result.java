import java.util.*;
public class Result
{
    public static void main(String[] args)
    {
        double a,b,c,d,e,total,per;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your MARKS out of 30.");
        System.out.print("Enter Your FEE MARKS: ");
        a=sc.nextInt();
        System.out.print("Enter Your FME MARKS: ");
        b=sc.nextInt();
        System.out.print("Enter Your EM-II MARKS: ");
        c=sc.nextInt();
        System.out.print("Enter Your FOP MARKS: ");
        d=sc.nextInt();
        System.out.print("Enter Your WORKSHOP MARKS: ");
        e=sc.nextInt();

        //logic
        total=a+b+c+d+e;
        per=total/5;

        System.out.println("\n");
         //result
        if(per>=26&&per<=30)
        {
            System.out.println("Congratulations! You are passed with A Grades!");
        }
        else if (per>=21&&per<=25)
        {
            System.out.println("Congratulations! You are passed with B Grades!");
        }
        else if(per>=13&&per<=20)
        {
            System.out.println("Congratulations! You are passed with C Grades!");
        }
        else if (per==12)
        {
            System.out.println("Congratulations! You are passed with D Grades!");
        }
        else
        {
            System.out.println("Alert! You are failed and you have to give makeup test to clear subject");
        }
        
    }    
}
