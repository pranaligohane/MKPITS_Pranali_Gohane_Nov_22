import java.util.Scanner;

class IntegerQue08
{
public static void main(String[] args)
{

Scanner sc= new Scanner(System.in);
System.out.print("Enter the number: ");
int x=sc.nextInt();

boolean b=trueValue(x);
System.out.println("The solution is: "+b);
}

public static boolean trueValue(int p)
{
int a = Math.abs(100-p);
int b = Math.abs(100-p);

if(a<10 || b<=10)
{
return true;
}
else
return false;
}
}
