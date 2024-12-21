import java.awt.*;
import java.awt.event.*;
public class mousedemo extends Frame implements MouseListener
{
TextField t1;
mousedemo()
{
setVisible(true);
setSize(500,500);
setLayout(new FlowLayout());
t1=new TextField(20);
add(t1);
addMouseListener(this);
}
public void mouseEntered(MouseEvent me)
{
t1.setText("x position"+me.getX()+"Y position"+me.getY());
}
public void mouseExited(MouseEvent me){}
public void mouseReleased(MouseEvent me){}
public void mousePressed(MouseEvent me){}
public void  mouseClicked(MouseEvent me){}
public static void main(String args[]){
new mousedemo();
}
}