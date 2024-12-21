import java.awt.*;
import java.awt.event.*;
class MouseDemo extends Frame implements MouseListener
{
TextField t1;
MouseDemo()
{
setVisible(true);
setSize(500,500);
setLayout(new FlowLayout());
t1=new TextField(20);
add(t1);
addMouseListener(this);
}
public void mouseClicked(MouseEvent me)
{
t1.setText("mouse event click zala");
}
public void mouseReleased(MouseEvent me)
{
t1.setText("mouseReleased");
}
public void mousePressed(MouseEvent me)
{
t1.setText("mouse event click zala");
}
public void mouseEntered(MouseEvent me)
{
t1.setText(" mouseEntered");
}
public void mouseExited(MouseEvent me)
{
t1.setText("mouseExited");
}
public static void main(String args[]){
new MouseDemo();
}
}