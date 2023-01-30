public class Exception_Handling_Demo01
{
public static void main(String[] args)
{
System.out.println("Start program");
int a=2;
int c=0;

try
{
c=a/3;
}

catch(ArithmeticException e)
{
System.out.println("Exception generated");
}
System.out.println("End program" +c);

}
}
