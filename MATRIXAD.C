#include<stdio.h>
#include<conio.h>
void main()
{
int a[2][2],b[2][2],c[2][2],i,j;
clrscr();
printf("enter a matrix elements\n");
for(i=0;i<=1;i++)
{
for(j=0;j<=1;j++)
{
scanf("%d",&a[i][j]);
}
}
printf("enter B matrix elements\n");
for(i=0;i<=1;i++)
{
for(j=0;j<1;j++)
{
scanf("%d",&b[i][j]);
}
}
for(i=0;i<=1;i++)
{
for(j=0;j<=1;j++)
{
c[i][j]=a[i][j]+b[i][j];
}
}
printf("addition of 2 matrix A and B is \n");
for(i=0;i<=1;i++)
{
for(j=0;j<=1;j++)
{
printf("%d",c[i][j]);
}
}
getch();
}