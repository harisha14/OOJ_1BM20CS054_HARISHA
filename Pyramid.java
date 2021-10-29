import java.util.*;

 
public class Pyramid
{
    public static void main(String arg[])
    {
        int i, j,n,k=1;
Scanner in=new Scanner(System.in);
System.out.println("Enter the number:");
n=in.nextInt();
        for(i=0; i<n; i++)
{
            for(j=0; j<=i; j++)
            {
                System.out.print(k++ + " ");


            }
            System.out.println();
        }
   }
}
 
   
 
