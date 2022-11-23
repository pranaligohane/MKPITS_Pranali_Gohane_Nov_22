#include<stdio.h>
#include<string.h>
void main()
{
char name[10];
clrscr();
printf("enter your name");
scanf("%s",name);
strrev(name);
printf("%s",name);
getch();
}