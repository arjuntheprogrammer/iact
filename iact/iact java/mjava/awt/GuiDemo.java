import java.awt.*;
import java.awt.event.*;
class SumNumber implements ActionListener
{
Frame f1;
Label l1,l2,l3;
TextField t1,t2;
Button b1,b2,b3;
public SumNumber()
{f1=new Frame();
f1.setSize(500,500);
l1=new Label("Enter First no");
l2=new Label("Enter Seocnd no");
l3=new Label("Sum of no  are");
t1=new TextField();
t2=new TextField();
b1=new Button("Sum Number");
b2=new Button("EXIT");
b3=new Button("CLEAR");
f1.add(l1);
f1.add(t1);
f1.add(l2);
f1.add(t2);
f1.add(b1);
f1.add(b2);
f1.add(b3);
f1.add(l3);
f1.setLayout(null);
l1.setBounds(50,100,100,30);
t1.setBounds(170,100,100,30);
l2.setBounds(50,150,100,30);
t2.setBounds(170,150,100,30);
b1.setBounds(50,200,100,30);
b2.setBounds(170,200,100,30);
b3.setBounds(280,200,100,30);
l3.setBounds(50,300,200,30);
f1.setVisible(true);
b1.addActionListener(this);//register the component with the listener
b2.addActionListener(this);
b3.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{if(e.getSource()==b1)
{int a=Integer.parseInt(t1.getText());
int b=Integer.parseInt(t2.getText());
int c=a+b;
l3.setText("Sum of two no are"+c);
}else if(e.getSource()==b2)
{t1.setText("");
t2.setText("");
l3.setText("");}
else if(e.getSource()==b3)
{System.exit(0);}}}
class GuiDemo
{public static void main(String ar[])
{new SumNumber();}}