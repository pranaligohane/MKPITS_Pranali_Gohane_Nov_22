#include<iostream.h>
#include<conio.h>
#include<string.h>
void main()
{
int c1,c2;
char user[10]={"ram"},pass[10]={"ram"},userp[10],passp[10];
cout<<"enter the user name:";
cin>>userp;
cout<<"enter the password:";
cin>>passp;
c1=strcmp(user,userp);
c2=strcmp(pass,passp);
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