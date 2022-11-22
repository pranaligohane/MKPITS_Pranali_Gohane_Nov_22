#include<stdio.h>
#include<conio.h>
void main()
{
int a[10],i,ser,flag=0;
clrscr();
printf("enter ten number\n");
for(i=0;i<10;i++)
{
scanf("%d",&a[i]);
}
printf("enter number to search");
scanf("%d",&ser);
for(i=0;i<10;i++)
{
if(a[i]==ser)
{
flag=1;
}
}//for close
printf("%d",ser);
printf("\n %d",flag);
if(flag==1)
{
printf("found");
}
else
{
printf("not found");
}
getch();
}
