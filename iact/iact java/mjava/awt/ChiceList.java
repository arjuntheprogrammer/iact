import java.awt.*;
import java.awt.event.*;

class MyChoice
{
Frame f1;
Label l1,l2;
Choice c1;
Button b1,b2,b3,b4;
TextField t1;
public MyChoice()
{
t1=new TextField();
f1=new Frame();
f1.setSize(600,600);
l1=new Label("Select Name");
c1=new Choice();

b1=new Button("ADD");
b2=new Button("REMOVE");
b3=new Button("DISPLAY");
b4=new Button("CLEAR ALL");

l2=new Label();

f1.add(l1);
f1.add(c1);
f1.add(b1);
f1.add(b2);
f1.add(b3);
f1.add(b4);
f1.add(l2);
f1.add(t1);
f1.setLayout(null);
l1.setBounds(100,100,100,40);
t1.setBounds(250,100,100,40);

c1.setBounds(100,200,100,40);

b1.setBounds(250,300,100,40);
b2.setBounds(250,350,100,40);
b3.setBounds(250,400,100,40);
b4.setBounds(250,450,100,40);

l2.setBounds(100,500,200,50);
f1.setVisible(true);
}
}
class ChoiceList
{
public static void main(String ar[])
{new MyChoice();
}}