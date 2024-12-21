import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class text extends Frame
{
public void paint(Graphics g){
Font f1=new Font("gigi",Font.PLAIN,50);
g.setFont(f1);
setBackground(Color.red);
g.drawString("shree swami samarth",200,300);
}
public static void main(String args[]){
text ob=new text();
ob.setVisible(true);
ob.setSize(300,400);
}
}