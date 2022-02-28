import java.util.*;
public class DataType
{
    public static void main(String[] args)
    {
        int a;
        float b;
        char c;
        String d;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Integer: ");
        a=sc.nextInt();
        System.out.print("Enter Float Number: ");
        b=sc.nextFloat();
        System.out.print("Enter Character: ");
        c=sc.next().charAt(0);
        System.out.print("Enter String: ");
        d=sc.next();
        System.out.println("\n\n");
        System.out.println("Integer: "+a);
        System.out.println("Float Number: "+b);
        System.out.println("Character: "+c);
        System.out.println("String: "+d);
    }
}
