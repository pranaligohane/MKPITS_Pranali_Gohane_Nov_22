#include<iostream.h>
#include<conio.h>
#include<string.h>
#include<stdlib.h>
void account();
void money();
void deposit();
void balance();
struct bank
{
int ac,bal;
char name[20];
char tyac[20];
}s[100];
void record()
{
int choice;
while(1)
{
cout<<"\npress 1 to create account";
cout<<"\npress 2 to withdrawn money";
cout<<"\npress 3 to deposit";
cout<<"\npress 4 to balance";
cout<<"\nenter your choice";
cout<<"enter 5 for exit";
cin>>choice;
switch(choice)
{
case 1:
account();
break;
case 2:
money();
break;
case 3:
deposit();
break;
case 4:
balance();
break;
case 5:
exit(0);
break;
default:
cout<<"invalid output";
}
}
}
void account()
{
cout<<"account is created";
}
void money()
{
cout<<"withdrawn 500";
}
void deposit()
{
cout<<"deposited 1000 rupee";
}
void balance()
{
cout<<"remaining balance 500000";
}
void exit()
{
cout<<"press 5 for exit";
}
void main()
{
int c1,c2,i=0;
char user[10]={"ram"},pass[10]={"xyz"},userk[10],passk[10],ch;
cout<<"enter the user name:";
cin>>userk;
cout<<"enter the password";
do
{
ch=getch();
cout<<"*";
passk[i]=ch;
i++;
}while(ch!='\r');
passk[i-1]='\0';
cout<<passk;
getch();
c1=strcmp(user,userk);
c2=strcmp(pass,passk);
clrscr();
if(c1==0 && c2==0)
{
record();
}
else
{
cout<<"invalid user";
}
getch();
}