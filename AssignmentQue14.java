/*Write a program to check which number nearest to the value 100 among two given integers. Return 0 if the two numbers are equal.*/

import java.util.Scanner;

class AssignmentQue14
{
public static void main(String[] args)
{

Scanner sc=new Scanner(System.in);
System.out.print("Enter any two numbers: ");
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("a = "+a);
System.out.println("b = "+b);

if((a>b && a<100) || (a<b && a>100))
{
System.out.println(a+" is nearest number to 100");
}
else if((b>a && b<100) || (b<a && b>100))
{
System.out.println(b+" is nearest number to 100");
}
else if(a==b)
{
System.out.println("Both numbers are same ="+0);
}

}
}

