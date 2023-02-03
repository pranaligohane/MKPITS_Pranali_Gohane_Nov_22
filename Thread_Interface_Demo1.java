class Thre1 implements Runnable

{
Thread t1;
public Thre1()
{
t1=new Thread(this);
t1.start();
}

@Override
public void run(){
for(int i=0; i<10; i++)
{
System.out.println(t1.getName()+" "+i);
}

}
}

public class Thread_Interface_Demo1
{
public static void main(String[] args)
{
Thre1 ob=new Thre1();
Thre1 ob1=new Thre1();

}
}