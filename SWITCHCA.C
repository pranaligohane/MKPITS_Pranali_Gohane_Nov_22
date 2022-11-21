#include<stdio.h>
#include<conio.h>
void main()
{
clrscr();
int choice,a,b,res;
printf("\n press 1 for add");
printf("\n press 2 for sub");
printf("\n press 3 for div");
printf("\n press 4 for mul");
printf("\n enter your choice");
scanf("%d",&choice);
switch(choice)
{
case 1:
printf("enter number");
scanf("%d%d",&a,&b);
res=a+b;
printf("add=%d",res);
break;
case 2:
printf("enter number");
scanf("%d%d",&a,&b);
res=a-b;
printf("sub=%d",res);
break;
case 3:
printf("enter number");
scanf("%d%d",&a,&b);
res=a/b;
printf("div=%d",res);
break;
case 4:
printf("enter number");
scanf("%d%d",&a,&b);
res=a*b;
printf("mul=%d",res);
break;
default:
printf("invalid choice");
}
getch();
}




