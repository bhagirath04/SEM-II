//Wirte Programme to calculate the volume of cube.
import java.util.*;
public class VolumeOfCube
{
    public static void main(String[] args)
    {
        double a,vol;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length of Cube A: ");
        a=sc.nextDouble();

        //logic
        vol=a*a*a;

        System.out.println("\n");

        //result
        System.out.println("Volume of Cube of Length "+a + ":" +vol);
    }  
}
