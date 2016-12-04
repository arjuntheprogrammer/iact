class DemoThread extends Thread
{
public DemoThread(String n)
{setName(n);
start();
}
public void run()
{for(int i=1;i<=5;i++)
{System.out.println(getName()+"\tis running\t"+i);
try
{Thread.sleep(2000);
}
catch(Exception e)
{}
}}}
class MyThread
{public static void main(String ar[])
{
DemoThread d1=new DemoThread("first thread");
DemoThread d2=new DemoThread("second thread");

Thread t=Thread.currentThread();
for(int i=1;i<=5;i++)
{System.out.println(t.getName()+"\tis running");
try
{Thread.sleep(1000);
}
catch(Exception e)
{}
}}}
/*
sleep(milliseconds)
public static sleep(long)throws InterruptException*/