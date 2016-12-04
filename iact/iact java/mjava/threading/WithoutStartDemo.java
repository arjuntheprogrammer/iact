class OtherThread extends Thread
{
public void run()
{for(int i=1;i<=5;i++)
{System.out.println("other thread is running");
try
{
Thread.sleep(1000);
}
catch(Exception e)
{}
}
}
}
class WithoutStartDemo
{
public static void main(String ar[])
{
OtherThread tt=new OtherThread();
tt.run();
Thread t=Thread.currentThread();
for(int i=1;i<=5;i++)
{
System.out.println(t.getName()+"\t\t is running");
try
{
Thread.sleep(1000);
}
catch(Exception e)
{}
}
}}