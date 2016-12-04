import java.awt.*;
import java.sql.*;

import java.awt.event.*;
import javax.swing.JOptionPane;
class OpenAccount implements ActionListener
{
Frame f1;
Label l1,l2,l3,l4,l5;
TextField t1,t2,t3;
Checkbox cb1,cb2;
CheckboxGroup cbg1;
Choice c1;
Button b1,b2;
public OpenAccount()
{
cbg1=new CheckboxGroup();
f1=new Frame();
f1.setSize(600,600);

l1=new Label("Enter Account no");
l2=new Label("Enter Customer name");
l3=new Label("Select Account Type");
c1=new Choice();
c1.add("SAVING");
c1.add("CURRENT");

l4=new Label("Select Gender");
cb1=new Checkbox("Male",cbg1,true);
cb2=new Checkbox("FeMale",cbg1,false);

l5=new Label("ENTER INITIAL BALANCE");

t1=new TextField();
t2=new TextField();
t3=new TextField();

b1=new Button("add record");
b2=new Button("clear");
f1.add(l1);
f1.add(l2);
f1.add(l3);
f1.add(l4);
f1.add(l5);

f1.add(t1);
f1.add(t2);
f1.add(t3);
f1.add(b1);
f1.add(b2);

f1.add(c1);
f1.add(cb1);
f1.add(cb2);


f1.setLayout(null);
l1.setBounds(50,100,100,30);
t1.setBounds(180,100,100,30);

l2.setBounds(50,150,100,30);
t2.setBounds(180,150,100,30);

l3.setBounds(50,200,100,30);
c1.setBounds(180,200,100,30);

l4.setBounds(50,250,100,30);
cb1.setBounds(50,300,100,30);
cb2.setBounds(200,300,200,30);

l5.setBounds(50,350,100,30);
t3.setBounds(180,350,100,30);


b1.setBounds(50,400,100,30);
b2.setBounds(180,400,100,30);

f1.setVisible(true);
b1.addActionListener(this);
b2.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
int acno=Integer.parseInt(t1.getText());
String cn=t2.getText();
String atype=c1.getSelectedItem();
String gender=null;
if(cb1.getState()==true)
gender="male";
else if(cb2.getState()==true)
gender="female";

int bal=Integer.parseInt(t3.getText());
try
{Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/edata?user=root&password=");
PreparedStatement ps=con.prepareStatement("insert into customer values(?,?,?,?,?)");
ps.setInt(1,acno);
ps.setString(2,cn);
ps.setString(3,atype);
ps.setString(4,gender);
ps.setInt(5,bal);

int a=ps.executeUpdate();
if(a==1)
JOptionPane.showMessageDialog(null,"RECORD ADDED");
else
JOptionPane.showMessageDialog(null,"RECORD NOT ADDED");
}catch(Exception ee){System.out.println(ee);}

}

}}