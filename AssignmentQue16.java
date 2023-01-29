/*Write a program to find the larger value from two positive integer values that is in the range 20..30 inclusive, or return 0 if neither is in that range.*/

import java.util.Scanner;

class AssignmentQue16
{
public static void main(String[] args)
{

Scanner sc=new Scanner(System.in);
System.out.print("Enter any two numbers: ");
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("a = "+a);
System.out.println("b = "+b);

int max = findMax(a,b);
System.out.println("The final result is: "+max);
}

public static int findMax(int x, int y)
{
if((x>20 && x<=30 && y>=20 && y<=30))
{
if(x>y)
return x;
else
return y;
}
else
return 0;
}
}


