import java.util.Scanner;
import java.lang.StringBuffer;

public class Palindrometype2
{
public static void main(String[] args){

Scanner sc=new Scanner(System.in);
System.out.println("Enter any name");
String a=sc.next();
System.out.println(a);

StringBuffer ob=new StringBuffer(a);
System.out.println(ob);

//using reverse
ob.reverse();
System.out.println(ob);

String rev=new String(ob);
System.out.println(rev);

//compare
if(a.equals(rev))
{
System.out.println("It is a palindrome");
}
else
{
System.out.println("It is not a palindrome");
}
}
}

