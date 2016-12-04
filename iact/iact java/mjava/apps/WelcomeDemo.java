import javax.swing.*;

class Welcome
{
JFrame f;
JProgressBar p1;
public Welcome()
{
f=new JFrame();
p1=new JProgressBar();
f.setSize(400,300);
f.setLayout(null);
f.add(p1);
p1.setBounds(50,100,100,50);
f.setVisible(true);
}

}
class WelcomeDemo
{
public static void main(String ar[])
{}
}