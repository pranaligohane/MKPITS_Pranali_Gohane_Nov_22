import java.util.Scanner;

class ReverseNum03
{
public static void main(String[] args)
{

Scanner sc=new Scanner(System.in);
System.out.print("Enter The Number To Be Reverse: ");
int n=sc.nextInt();
int y=0;

while(n>0)
{
int x=n%10;
y=y*10+x;
n=n/10;
}

System.out.println("Number After Reversing = "+y);
}
}