class one1
{
int a1=12;
void dis1()
{
System.out.println("one called");
two tob=new two();
tob.dis();
}

class two
{
int a;
void dis()
{

System.out.println("two"+a1);
}
}
}

public class one2{
public static void main(String[]args){
one1 ob=new one1();
ob.dis1();
}
}
