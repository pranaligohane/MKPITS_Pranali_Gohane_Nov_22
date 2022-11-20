#include<stdio.h>
#include<conio.h>
void main()
{
int num,r;
clrscr();
printf("enter the no of keyboard");
scanf("%d",&num);
r=num%4;
if(r==0)
{
printf("divisible by 4");
}
getch();
}