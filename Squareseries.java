class Squ    
{
int i;
int sum=0;  
void set()
{                     
for(i=1;i<=20;i++)                       
{
sum=i*i;
System.out.println(sum);
}
}
}

class Squareseries
{
public static void main(String[]args)
{
Squ ob1=new Squ();
ob1.set();
}
}