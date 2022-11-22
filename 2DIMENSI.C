#include<stdio.h>
#include<conio.h>
void main()
{
int i,j,mat[2][2];
for(i=0;i<=1;i++)
{

for(j=0;j<=1;j++)
{
printf("mat[%d][%d]=",i,j);
scanf("%d",&mat[i][j]);
}
}
for(i=0;i<=1;i++)
{
for(j=0;j<=1;j++)
{
printf("mat[%d][%d],=%d",i,j,mat[i][j]);
}
}

getch();
}