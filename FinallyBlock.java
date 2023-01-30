public class FinallyBlock
{
public static void main(String[] args)
{
System.out.println("Start program");

int a=2;
int c=0;

try
{
c=a/0;
}

catch (ArithmeticException e)
{
System.out.println("Exception generated");
}

finally{
System.out.println("Finally block executed");
}
System.out.println("End program" +c);

}
}