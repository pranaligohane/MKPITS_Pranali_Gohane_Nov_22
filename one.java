public classone{
public static void main(String[]args){
//byte ->short->int->long->float->double
byte a=2;
short s=a;  //implicit casting byte to short
long l1=12;
a=(byte)l1; //explicit casting long to byte
System.out.println("the result is "+s);
System.out.println("the result is "+a);
}
}