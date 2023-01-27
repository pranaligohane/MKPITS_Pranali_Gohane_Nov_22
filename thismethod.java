class thisdemo
{
int a;
void set(int a)
{
this.a=a;
}
void dis()
{
System.out.println(a);
}
}

public class thismethod{
public static void main(String[] args){
thisdemo ob1 = new thisdemo();
thisdemo ob2 = new thisdemo();

ob1.set(3);
ob2.set(4);

ob1.dis();
ob2.dis();
}
} 