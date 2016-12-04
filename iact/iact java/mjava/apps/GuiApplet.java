import java.applet.Applet;
import java.awt.*;
/*
<applet code="GuiApplet.class" width="600" height="600">
</applet>
*/
public class GuiApplet extends Applet implements Runnable
{
Color c1,c2;
int f=0;
Thread t;
public void init()
{
c1=Color.RED;
c2=Color.YELLOW;
t=new Thread(this);
t.start();
}
public void run()
{
while(true)
{
if(f==0)
{
c1=Color.RED;
c2=Color.YELLOW;
f=1;
}
else if(f==1)
{
c1=Color.YELLOW;
c2=Color.RED;
f=0;
}
try
{
Thread.sleep(2000);
}
catch(Exception e)
{}
repaint();
}
}
public void paint(Graphics g)
{
g.setColor(c1);
g.fillRect(150,200,200,200);
g.setColor(c2);
g.fillRect(180,250,150,100);
Font f=new Font("comic sans ms",Font.PLAIN,20);
g.setFont(f);
g.setColor(Color.BLUE);
g.drawString("IACT EDUCATION",200,300);
}}
