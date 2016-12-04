class MyPrinter
{public synchronized void myPrint(String x)
{System.out.print("\n["+x);
try
{Thread.sleep(1000);
}
catch(Exception e)
{}
System.out.println("]");
}}
class Client extends Thread
{MyPrinter m;
String data;
public Client(MyPrinter m,String data)
{this.m=m;
this.data=data;
start();
}
public void run()
{m.myPrint(data);
}}
class SynchDemo
{public static void main(String ar[])
{MyPrinter mp=new MyPrinter();
new Client(mp,"hello");
new Client(mp,"Computer");
new Client(mp,"World");
}}