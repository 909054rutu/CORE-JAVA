import java.awt.*;
import java.awt.event.*;
class MouseD extends Frame implements MouseListener
{
TextField t1;
MouseD()
{
setVisible(true);
setSize(500,500);
setLayout(new FlowLayout());
t1=new TextField(20);
add(t1);
addMouseListener(this);
}
public void mouseClicked(MouseEvent me){
t1.setText("mouseClicked");
}
public void mouseExited(MouseEvent me){
t1.setText("mouseExited");
}
public void mousePressed(MouseEvent me){
t1.setText("mousePressed");
}
public void mouseEntered(MouseEvent me){
t1.setText("mouseEntered");
}
public void mouseReleased(MouseEvent me){
t1.setText("mouseReleased");
}
public static void main(String args[]){
new MouseD();
}
}