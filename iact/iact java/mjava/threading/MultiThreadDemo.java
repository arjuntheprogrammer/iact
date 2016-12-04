class MultiThread extends Thread
{int n,num;
public MultiThread(int a,String name,int num)
{n=a;
setName(name);
this.num=num;
start();
}
public void run()
{if(n==1)
{int f=1;
for(int i=1;i<=num;i++)
{f=f*i;
System.out.println(getName()+"\t\t is working \t"+f);
try{Thread.sleep(2000);}
catch(Exception e)
{}}}
else if(n==2)
{int s=0;
while(num>0)
{int a=num%10;
s=s*10+a;
num=num/10;
System.out.println(getName()+"\t\tis working\t"+s);
try{Thread.sleep(3000);}
catch(Exception e){}}}
else if(n==3)
{for(int i=1;i<=10;i++)
{System.out.println(num+"\t*\t"+i+"\t="+num*i);
try{Thread.sleep(3000);}
catch(Exception e){}}}
}}
class MultiThreadDemo
{public static void main(String ar[])
{new MultiThread(1,"factorial",5);
new MultiThread(2,"reverse",534);
new MultiThread(3,"table",5);
}}