import javax.awt.*;
import java.awt.event.*;

class Login implements ActionListener
{
Frame f1;
Label l1,l2;
TextField t1,t2;
Button b1,b2;
public Login()
{
f1=new Frame();
f1.setSize(400,400);

l1=new Label("Enter User Name");
l2=new Label("Enter Password");

t1=new TextField();
t2=new TextField();

b1=new Button("login");
b2=new Button("exit");


f1.add(l1);
f1.add(l2);
f1.add(t1);
f1.add(t2);
f1.add(b1);
f1.add(b2);

f1.setLayout(null);

l1.setBounds(50,50,100,30);
t1.setBounds(180,50,100,30);

l2.setBounds(50,100,100,30);
t2.setBounds(180,100,100,30);

b1.setBounds(50,150,100,30);
b2.setBounds(180,150,100,30);

f1.setVisible(true);

b1.addActionListener(this);
b2.addActionListener(this);

}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
String uid=t1.getText();
String pass=t2.getText();
if(uid.equals("admin")&&pass.eqauls("admin"))
{
new MyMenu();
}
else
{}

}
else if(e.getSource()==b2)
{
System.exit(0);
}
}
}