import java.awt.*;

class Frame1
{
Frame f1;
Button b1;

Frame1(){
f1=new Frame();
b1=new Button("HELLO");

f1.setLayout(new BorderLayout());
f1.add(b1,BorderLayout.NORTH);
f1.add(new Button("NORTH"), BorderLayout.NORTH);
f1.add(new Button("SOUTH"),BorderLayout.SOUTH);
f1.add(new Button("EAST"),BorderLayout.EAST);
f1.add(new Button("WEST"),BorderLayout.WEST);
f1.add(new Button("CENTER"),BorderLayout.CENTER);

f1.setSize(200,200);
f1.setVisible(true);
}
}

class Frame_Demo03{
public static void main(String[] args){
new Frame1();

}
}



