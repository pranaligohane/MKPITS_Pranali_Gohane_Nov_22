public class ThreadSuspend
{
public static void main(String[] args)
{

Th1 ob1=new Th1();
ob1.setName("Ram");
Th1 ob2=new Th1();
ob2.setName("Shyam");
Th1 ob3=new Th1();
ob3.setName("Ghanshyam");

ob1.start();
ob2.start();
ob3.start();

try{
System.out.println(ob2.getName()+"is suspending");
Thread.sleep(1000);
ob2.suspend();
Thread.sleep(1000);
ob2.resume();
System.out.println(ob2.getName()+"is resumed");

}catch(Exception e) {}
System.out.println("is dead"+ob2.getName()+" "+ob2.isAlive());
}
}








