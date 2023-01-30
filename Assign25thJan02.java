import java.util.Scanner;

public class Assign25thJan02
{
public static void main(String[] args)
{

int a[]={1,2,3,4,5,6,};
int x,y;
if(a.length%2==0)

{
System.out.print("Length of the even number=" +a.length);
x=a[a.length/2-1];
System.out.println("The middle term is="+x);
y=a[a.length/2];
System.out.println("The middle term is="+y);
System.out.println("The middle term array is=" +x+" "+y);
}
else
{
System.out.println("The number is not even");

}
}
}

