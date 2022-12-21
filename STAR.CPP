#include<iostream.h>
#include<conio.h>
#include<string.h>
#include<stdio.h>
void main()
{
int c1,c2,i=0;
char user[10]={"ram"},pass[10]={"ram"},userp[10],passp[10],ch;
cout<<"enter the user name:";
cin>>userp;
cout<<"enter the password:";
do
{
ch=getch();
passp[i]=ch;
cout<<"*";
i++;
}while(ch!='\r');
passp[i-1]='\0';
cout<<passp;
getch();
c1=strcmp(user,userp);
c2=strcmp(pass,passp);
clrscr();
if(c1==0 && c2==0)
{
cout<<"Welcome To XYZ Bank";
}
else
{
cout<<"invalid user";
}
getch();
}