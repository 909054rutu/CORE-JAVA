import java.awt.*;
import java.awt.Graphics.*;

public class slip7_1 extends Frame{
public void paint(Graphics g){
Font f1=new Font("gigi",Font.PLAIN,200);
g.setFont(f1);
g.drawString("shree swami samrath",400,600);
setBackground(Color.red);
}
public static void main(String args[]){
slip7_1 ob=new slip7_1();
ob.setVisible(true);
ob.setSize(500,500);
}
}