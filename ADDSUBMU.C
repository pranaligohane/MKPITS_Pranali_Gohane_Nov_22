#include<stdio.h>
#include<conio.h>
void add()
{
int a,b,res;
printf("enter the number");
scanf("%d %d",&a,&b);
res=a+b;
printf("the addition of two no=%d\n",res);
}
void sub()
{
int a,b,res;
printf("enter the number");
scanf("%d %d",&a,&b);
res=a-b;
printf("the substraction of two no=%d\n",res);
}
void mul()
{
int a,b,res;
printf("enter the number");
scanf("%d %d",&a,&b);
res=a*b;
printf("the multiplication of two no=%d\n",res);
}
void div()
{
int a,b,res;
printf("enter the number");
scanf("%d %d",&a,&b);
res=a/b;
printf("the division of two no=%d\n",res);
}
void main()
{
int choice;
printf("enter 1 for choice\n");
printf("enter 2 for choice\n");
printf("enter 3 for choice\n");
printf("enter 4 for choice\n");
printf("enter 5 for exit");
printf("enter your choice");
scanf("%d",&choice);
switch( choice)
{

case 1:
add();
break;
case 2:
break;
sub();
case 3:
break;
mul();
break;
case 4:
div();
break;
case 5:

default:
printf("enter invalid choice");
}
getch();
}