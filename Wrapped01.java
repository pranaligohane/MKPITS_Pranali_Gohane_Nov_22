public class Wrapped01
{
public static void main(String[] args)
{

int a=2;
Integer ob=new Integer(a);   // Primitive int to integer object using constructor.


System.out.println(ob);
Integer ob2=Integer.valueOf(a);   // Primitive int to integer object using method.

System.out.println(ob2);
int x=ob.intValue();
System.out.println(x);   // Object is primitive.

String iob=ob.toString();   // Integer object to string.
String iob2=Integer.toString(a);   // Primitive object to string.

System.out.println(iob2);

int y=Integer.parseInt(iob);   //String object to primitive int.

Integer z=Integer.valueOf(iob2);   //String object to integer object.
System.out.println(z);


}
}

