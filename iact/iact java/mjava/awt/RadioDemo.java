import java.awt.*;
import java.awt.event.*;
class UseRadio implements ActionListener
{Label l1,l2;
TextField t1;
Checkbox cb1,cb2;
Button b1,b2;
Frame f1;
CheckboxGroup cbg1;
public UseRadio()
{f1=new Frame();
f1.setSize(500,500);
cbg1=new CheckboxGroup();
l1=new Label("Enter Your Name");
t1=new TextField();

cb1=new Checkbox("Male",cbg1,true);
cb2=new Checkbox("Female",cbg1,false);

b1=new Button("Show");
b2=new Button("Exit");
l2=new Label("Welcome.....");
f1.add(l1);
f1.add(t1);
f1.add(b1);
f1.add(b2);
f1.add(l2);
f1.add(cb1);
f1.add(cb2);
f1.setLayout(null);
l1.setBounds(100,100,100,40);
t1.setBounds(250,100,100,40);
cb1.setBounds(100,150,100,40);
cb2.setBounds(250,150,100,40);
b1.setBounds(100,300,100,40);
b2.setBounds(250,300,100,40);
l2.setBounds(100,400,200,40);
f1.setVisible(true);
b1.addActionListener(this);
b2.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{String n=t1.getText();
if(e.getSource()==b1)
{if(cb1.getState()==true)
{l2.setText("Hello........Mr..."+n);}
else if(cb2.getState()==true)
{l2.setText("Hello........Miss..."+n);}}
else if(e.getSource()==b2)
{System.exit(0);}}}
class RadioDemo
{public static void main(String ar[])
{new UseRadio();}}