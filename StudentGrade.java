import java.util.*;

class StudentGrade
{
public static void main(String arg[])
{
int grade,c,s;
Scanner in=new Scanner(System.in);
System.out.println("Enter the CIE marks:");
c=in.nextInt();
System.out.println("ENter the SEE marks:");
s=in.nextInt();
grade=c+(s/2);
if(grade>=90)
System.out.println("Your Grade is S.");
else if(grade>=80)
System.out.println("Your grade is A.");
else if(grade>=70)
System.out.println("Your grade is B.");
else if(grade>=60)
System.out.println("Your grade is C.");
else if(grade>=50)
System.out.println("Your grade is D.");
else if(grade>=40)
System.out.println("Your grade is E.");
else
System.out.println("Fail.");
}
}

