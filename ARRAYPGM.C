#include<stdio.h>
#include<conio.h>
void main()
{
int a[10],ser,i;
printf("enter the 10 number in array");
for(i=0;i<=10;i++)
{
scanf("%d",a[i]);
}
printf("enter number to search");
scanf("%d",&ser);
for(i=0;i<=10;i++)
{
if(ser==a[i])
{
printf("found");
}
getch();

}
}