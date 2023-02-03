class Th2 extends Thread
{

@Override
public void run(){
for(int i=0; i<10; i++){
System.out.println(" " +i);
}
}
}

public class Thread_Demo02{
public static void main(String[] args){
Th1 ob1=new Th1();
Th2 ob2=new Th2();
ob1.start();
ob2.start();
}
}
