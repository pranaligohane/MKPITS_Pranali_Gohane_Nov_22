class arraydemo{
void fun(){
int a[]={1,2,3,4};
int[]a1;
for(int i=0;i<=3;i++)
{

System.out.println(a[i]);
}
for(int i=0;i<=a.length;i++)
{
System.out.println(a[i]);
}
}
}

public class length{
public static void main(String[] args){
arraydemo ob=new arraydemo();
ob.fun();
}
}