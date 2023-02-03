public class ThreadIsAlive
{
public static void main(String[] args)
{

Th1 ob1=new Th1();
//ob1.setName("Ram");
Th1 ob2=new Th1();
//ob2.setName("Shyam");
Th1 ob3=new Th1();

ob1.start();
ob2.start();
ob3.start();

System.out.println("Waiting to die for" +ob2.getName()+" "+ob2.isAlive());
try{
ob2.join();
Thread.sleep(1000);
}catch(InterruptedException e) {}

System.out.println("Is dead" +ob2.getName()+" "+ob2.isAlive());
}
}