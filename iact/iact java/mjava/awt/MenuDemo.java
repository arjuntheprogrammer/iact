import java.awt.*;
import java.awt.event.*;

class MyMenu implements ActionListener
{
Frame f1;
MenuBar mbar;
Menu m1,m2,m3;
MenuItem item1,item2,item3,item4,item5,item6,item7,item8;
public MyMenu()
{
f1=new Frame();
f1.setSize(600,600);

mbar=new MenuBar();
f1.setMenuBar(mbar);

m1=new Menu("ACCOUNT");
m2=new Menu("TRANSACTION");
m3=new Menu("REPORT");

item1=new MenuItem("OPEN ACCOUNT");
item2=new MenuItem("MODIFY ACCOUNT");
item3=new MenuItem("CLOSE ACCOUNT");

m1.add(item1);
m1.add(item2);
m1.add(item3);

mbar.add(m1);


item4=new MenuItem("DEPOSIT MONEY");
item5=new MenuItem("WITHDRAW MONEY");
item6=new MenuItem("TRANSFER MONEY");

m2.add(item4);
m2.add(item5);
m2.add(item6);

mbar.add(m2);


item7=new MenuItem("ENQUIRY ACCOUNT");
item8=new MenuItem("DISPLAY ALL");

m3.add(item7);
m3.add(item8);

mbar.add(m3);
f1.setVisible(true);
item1.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==item1)
{
new OpenAccount();
}
}
}
class MenuDemo
{public static void main(String ar[])
{new MyMenu();}}