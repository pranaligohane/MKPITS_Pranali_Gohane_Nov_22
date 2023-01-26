class adddemoobj
{

private int a,b;
int res;
void set(int x, int y)
{

a=x;
b=y;
}
void sum()
{
res=a+b;
}


void dis()
{
System.out.println(res);
}
}

public class demo{
public static void main(String[] args){
adddemoobj ob=new adddemoobj();
ob.set(12,3);
//ob.a=12
//ob.b=3

ob.sum();
ob.dis();
}
}

