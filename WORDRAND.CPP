#include<iostream.h>
#include<conio.h>
void main()
{
long int num,c=0,n1,n,rev=0;
clrscr();
cout<<"enter n digit number:";
cin>>num;
while(num>0)
{
n=num%10;
rev=(rev*10)+n;
num=num/10;
}
while(rev>0)
{
n1=rev%10;
c=c+1;
rev=rev/10;
switch(n1)
{
case 1:
cout<<"one";
break;
case 2:
cout<<"two";
break;
case 3:
cout<<"three";
break;
case 4:
cout<<"four";
break;
case 5:
cout<<"five";
break;
case 6:
cout<<"six";
break;
case 7:
cout<<"seven";
break;
case 8:
cout<<"eight";
break;
case 9:
cout<<"nine";
break;
}
}
getch();
}


















































