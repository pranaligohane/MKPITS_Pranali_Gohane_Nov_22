import java.awt.*;
class Frme1{

Frame f1;
Window w1;

Frme1()

{
f1=new Frame();
w1=new Window(f1);
w1.setSize(500,500);
w1.setVisible(true);
}
}

public class Frame_Demo2
{
public static void main(String[] args)
{
new Frme1();
}
}