class MThread implements Runnable
{Thread t;
public MThread(String x)
{t=new Thread(this);
t.setName(x);
t.start();
}
public void run()
{for(int i=1;i<=5;i++)
{System.out.println(t.getName()+"\t\t is running");
try
{Thread.sleep(1000);}
catch(Exception e)
{}}}}
class DemoTh
{public static void main(String ar[])
{new MThread("first");
new MThread("second");}}
