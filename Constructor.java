import java.util.Scanner;
class thisdemo
{
int a;
thisdemo()
{

Scanner scanner=new Scanner(System.in);
System.out.println("Enter Number");
a=scanner.nextInt();
}

void dis()
{
System.out.println("a= "+a);
}
}

class Constructor
{
public static void main(String[]args){

thisdemo ob1 = new thisdemo();
thisdemo ob2 = new thisdemo();

ob1.dis();
ob2.dis();
}
}
