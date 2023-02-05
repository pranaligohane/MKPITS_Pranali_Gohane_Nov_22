public class ThreadGroup extends Thread

{
@Override
public void run()
{
System.out.println("Hi");
}

public static void main(String[] args)

{
ThreadGroup grp1=new ThreadGroup("Mkpits");
Thread t1=new Thread(grp1,"P1");
Thread t2=new Thread(grp1,"P2");
System.out.println(grp1);
grp1.setMaxPriority(Thread.NORM_PRIORITY);
System.out.println(grp1);
System.out.println(t1);
System.out.println(grp1.getName());
}
}