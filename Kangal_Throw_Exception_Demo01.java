class KangalException extends Exception
{
KangalException(String s)
{
super(s);
}
}

public class Kangal_Throw_Exception_Demo01{
public static void main(String[] args) throws Exception
{

int bal=3000;
int width=5000;
if(bal>width)
{

System.out.println("Take money");
}
else
{

KangalException ob=new KangalException("Not having money");
throw ob;
}
}
}