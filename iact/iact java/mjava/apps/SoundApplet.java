import java.applet.*;
import java.awt.*;
/*
<applet code="SoundApplet.class" width="500" height="500">
<param name="msg" value="welcome to applet">
</applet>
*/
public class SoundApplet extends Applet
{
AudioClip ap;
Image img;
String x;
public void init()
{
x=getParameter("msg");
ap=getAudioClip(getDocumentBase(),"a.wav");
ap.play();
img=getImage(getDocumentBase(),"a1.jpg");
}
public void paint(Graphics g)
{
g.drawImage(img,200,100,this);
g.drawString(x,70,70);
}}