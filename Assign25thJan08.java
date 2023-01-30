import java.util.Scanner;

public class Assign25thJan08
{
public static void main(String[] args)
{

int count=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter your no");

int n=sc.nextInt();
int arr[]=new int[n];

System.out.println("Enter "+n+"element");
for(int i=0; i<arr.length; i++)
{
arr[i]=sc.nextInt();
}

System.out.println("Enter array value");
for(int i=0; i<arr.length; i++)
{
if(arr[i]%2==0)
{
System.out.println("Even no=" +arr[i]);
count++;
}
}
System.out.println("count=" +count);
}
}

