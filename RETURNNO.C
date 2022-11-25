#include<stdio.h>
#include<conio.h>
int rev()        //with return no argument
{
int num,n1,n2,n3,rev;
printf("enter the digit in num");
scanf("%d",&num);
n1=num%10;
num=num%10;
n2=num%10;
num=num%10;
num3=num%10;
num=num%10;
rev=n1*100+n2*10+n3*1;
return rev;
}
void main()
{
int r;
r=rev();
print("rev order=%d",r);
getch();
}
