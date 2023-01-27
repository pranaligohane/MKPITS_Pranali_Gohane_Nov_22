import java.util.Scanner;

class Assign06
{
int n1,n2,add,sub,mul,div;
void set()
{

Scanner sc=new Scanner(System.in);
System.out.println("Enter first number");
n1=sc.nextInt();

System.out.println("Enter second number");
n2=sc.nextInt();

int add = n1+n2;
int sub = n1-n2;
int mul = n1*n2;
int div = n1/n2;

System.out.println("Addition is:"+add);
System.out.println("Subtraction is:"+sub);
System.out.println("Multiplication is:"+mul);
System.out.println("Division is:"+div);

}
}

public class Assign06_Arithematic
{
public static void main(String[] args)
{
Assign06 ob=new Assign06();
ob.set();
}
}






