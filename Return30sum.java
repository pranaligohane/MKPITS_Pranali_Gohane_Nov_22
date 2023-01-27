import java.util.*;

class return30
{
int n1,n2,sum;

void coll()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1st Integer");
n1=sc.nextInt();
System.out.println("Enter 2nd Integer");
n2=sc.nextInt();

//condition
if(n1==30 || n2==30)
{
System.out.println("true");
}
else
{
sum=n1+n2;
System.out.println(sum);
if(sum==30)
{
System.out.println("true");
}
}
}
}

public class Return30sum
{
public static void main(String[] args)
{
return30 ob=new return30();
ob.coll();
}
}
