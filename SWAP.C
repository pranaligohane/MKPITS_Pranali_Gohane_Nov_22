#include<stdio.h>
#include<conio.h>
void main()
{
int num1,num2,swap;
clrscr();
printf("enter the two no");
scanf("%d%d",&num1,num2);

printf("the before swapping num1=%d num2=%d",num1,num2);
swap=num2;
num2=num1;
num1=swap;

getch();
}