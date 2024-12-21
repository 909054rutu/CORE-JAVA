import java.awt.*;
import java.awt.event.*;
public class s2_2 extends Frame implements MouseListener{
TextField t1;
s2_2()
{
setVisible(true);
setSize(500,400);
setLayout(new FlowLayout());
t1=new TextField(20);
add(t1);
addMouseListener(this);
}
public void  mouseEntered(MouseEvent me){
t1.setText("x:pos"+me.getX()+"y:pos"+me.getY());
}
public void mouseExited (MouseEvent me){
}
public void mouseReleased(MouseEvent me){
}
public void mousePressed(MouseEvent me){
}
public void  mouseClicked(MouseEvent me){
}
public static void main(String args[]){
s2_2 ob=new s2_2();
}
}