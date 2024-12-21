import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.applet.*;

public class lamp extends Applet implements ActionListener
{
Button b1;
public void init(){
b1=new Button("Ok");
add(b1);
b1.addActionListener(this);
}
public void actionPerformed(ActionEvent ae){
if(ae.getSource()==b1){
repaint();
}
}
public void paint(Graphics g){
Random r1=new Random();
int r=r1.nextInt(200);
int g1=r1.nextInt(205);
int b=r1.nextInt(217);
Color c1=new Color(r,g1,b);
g.setColor(c1);
g.fillOval(100,100,200,300);
}
}

/*
<applet code="lamp" width="500" height="400">
</applet>
*/