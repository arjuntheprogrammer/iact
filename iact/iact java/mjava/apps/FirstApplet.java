import java.applet.Applet;
import java.awt.*;
/*
<applet code="FirstApplet.class" width="600" height="600">
</applet>
*/

public class FirstApplet extends Applet
{
public void init()
{
System.out.println("Applet is initialized");
}
public void start()
{
System.out.println("Applet is started");
}
public void stop()
{
System.out.println("Applet is stoped");
}
public void destroy()
{
System.out.println("Applet destroyed");
}
public void paint(Graphics g)
{
g.drawString("This is my first applet",200,300);
}}
