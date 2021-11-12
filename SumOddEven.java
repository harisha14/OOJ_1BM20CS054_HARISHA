import java.util.Scanner;
class SumOddEven
{
public static void main (String args[])
{
int size,oddSum=0,evenSum=0;
Scanner in=new Scanner(System.in);
System.out.print("Enter the numbers of elements: ");
size=in.nextInt();
int arr[]=new int[size];
System.out.print("Enter the numbers : ");
for(int i=0; i<size; i++)
{
arr[i]=in.nextInt();
}
for(int i=0; i<size; i++)
{
if(arr[i]%2==0)
{
evenSum=evenSum+arr[i];
}
else
{
oddSum=oddSum+arr[i];
}
}
System.out.println("\nSum of even is: "+evenSum);
System.out.println("\nSum of odd is: "+oddSum);
}
}