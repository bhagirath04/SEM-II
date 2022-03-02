public class Sum100to200
{
    public static void main(String[] args)
    {
        int i,sum=0;
        
        //logic
        System.out.println("The numbers between 100 and 200 and are divisible by 5.");
        for ( i = 101; i < 200; i++)
        {
            if(i%5==0)
            {
                System.out.print(" "+i);
                sum+=i;
            }
        } 
        System.out.println("\n\n The Sum is: "+ sum);
    }    
}
