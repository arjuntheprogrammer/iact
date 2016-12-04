import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class EmpAddRecord implements ActionListener
{
Frame f1;
Label l1,l2,l3,l4;
TextField t1,t2,t3;
Button b1,b2,b3;
public EmpAddRecord()
{
f1=new Frame();
f1.setSize(600,600);

l1=new Label("Enter Employee no");
l2=new Label("Enter Employee name");
l3=new Label("Enter Employee salary");
l4=new Label("");
t1=new TextField();
t2=new TextField();
t3=new TextField();
b1=new Button("add record");
b2=new Button("clear");
b3=new Button("Exit");
f1.add(l1);
f1.add(l2);
f1.add(l3);
f1.add(l4);
f1.add(t1);
f1.add(t2);
f1.add(t3);
f1.add(b1);
f1.add(b2);
f1.add(b3);
f1.setLayout(null);
l1.setBounds(50,100,100,30);
t1.setBounds(180,100,100,30);

l2.setBounds(50,150,100,30);
t2.setBounds(180,150,100,30);

l3.setBounds(50,200,100,30);
t3.setBounds(180,200,100,30);
b1.setBounds(50,250,100,30);
b2.setBounds(180,250,100,30);
b3.setBounds(300,250,100,30);
l4.setBounds(50,400,200,40);
f1.setVisible(true);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{if(e.getSource()==b1)
{int eno=Integer.parseInt(t1.getText());
String en=t2.getText();
int sal=Integer.parseInt(t3.getText());
try
{Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/edata?user=root&password=");
PreparedStatement ps=con.prepareStatement("insert into emp values(?,?,?)");
ps.setInt(1,eno);
ps.setString(2,en);
ps.setInt(3,sal);
int a=ps.executeUpdate();
if(a==1)
l4.setText("RECORD ADDED");
else
l4.setText("RECORD NOT ADDED");
}catch(Exception ee){System.out.println(ee);}
}
else if(e.getSource()==b2)
{t1.setText("");t2.setText("");t3.setText("");l4.setText("");}
else if(e.getSource()==b3)
{System.exit(0);}
}}
class AddGui
{public static void main(String ar[])
{new EmpAddRecord();}}