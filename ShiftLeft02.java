import java.util.Scanner;

class ShiftLeft02
{
public static void main(String[] args)
{

Scanner sc=new Scanner(System.in);
System.out.print("Enter the number: ");
int x=sc.nextInt();
System.out.println("Number Before 2 Bits Shifting To Left");
System.out.println("x= "+x);

x= x << 2;      // For left shifting

//x= x>> 2;    // For right shifting

System.out.println("Number After 2 Bits Shifting To Left");
System.out.println("x= "+x);

}
}


