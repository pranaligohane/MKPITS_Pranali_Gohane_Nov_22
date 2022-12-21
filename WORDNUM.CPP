#include<iostream.h>
#include<conio.h>
void main()
{
long int num,c=0,n1;
cout<<"enter n digit number:";
cin>>num;
while(num>0)
{
n1=num%10;
c=c+1;
num=num/10;
}
cout<<c<<n1;
getch();
}