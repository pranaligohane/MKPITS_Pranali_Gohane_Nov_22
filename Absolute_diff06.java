import java.util.*;

class Absolute
{
int n,diff;

void set()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Number");
n=sc.nextInt();
}

void calc()
{
diff=51-n;

//condition
if(n<=51)
{

System.out.println("Absolute difference="+diff);
}
if(n>51)
{
diff=n-51;

System.out.println("Difference multiply by 3="+(diff*3));
}
}
}

public class Absolute_diff06
{
public static void main(String[] args)
{
Absolute ob=new Absolute();
ob.set();
ob.calc();
}
}


