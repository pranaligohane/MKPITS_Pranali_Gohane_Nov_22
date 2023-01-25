import java.util.Scanner;

class Sum_Of_Positive_Integer_500
{
public static void main(String[] args)
{

Scanner sc=new Scanner(System.in);
System.out.print("Enter Any Positive Integer Less Than 500= ");
int n=sc.nextInt();
int y=0;

while(n>0 && n<500)
{
int x=n%10;
y=y+x;
n=n/10;
}

System.out.print("Sum Of Digits Of Entered Number= "+y);
}
}

