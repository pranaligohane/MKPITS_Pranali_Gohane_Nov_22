class adddemoreference{
//1 usage
int a=2, b=4;
//2 usage
int res;
void sum()
{
res=a+b;;
}
//1 usage
void dis()
{
System.out.println(res);
}
}

public class reference{
public static void main(String[] args){
adddemoreference ob = new adddemoreference();
ob.sum();
ob.dis();

adddemoreference ob2=ob;

ob2.dis();
//change ob2
ob2.a = 12;
System.out.println(ob2.a);
ob2.dis();
}
}