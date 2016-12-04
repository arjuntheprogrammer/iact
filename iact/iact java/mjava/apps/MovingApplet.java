import java.applet.Applet;
import java.awt.*;
/*
<applet code="MovingApplet.class" width="600" height="600">
</applet>
*/
public class MovingApplet extends Applet implements Runnable
{Thread t;
int x;
public void init()
{x=230;
t=new Thread(this);
t.start();
}
public void run()
{while(true)
{x+=3;
try{Thread.sleep(2000);}
catch(Exception e)
{}repaint();
}}
public void paint(Graphics g)
{g.drawOval(200,300,100,100);
g.fillOval(x,330,30,30);
}}