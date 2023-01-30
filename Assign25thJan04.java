import java.util.Scanner;

public class Assign25thJan04
{
public static void main(String[] args)
{

int a[]={1,2,3,4,5,6};
int temp;
temp=a[0];
a[0]=a[5];
a[5]=temp;

for(int i=0; i<a.length; i++)
{
System.out.print(" "+a[i]);

}
}
}