import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.applet.*;

public class smile extends Applet{
public void paint(Graphics g){
Font f1=new Font("gigi",Font.BOLD,200);
g.setFont(f1);
g.setColor(Color.yellow);
g.fillOval(150,150,200,200);
g.setColor(Color.red);
g.drawOval(200,200,25,25);
g.drawOval(270,200,25,25);
g.drawArc(200,220,100,100,180,180);
}
}