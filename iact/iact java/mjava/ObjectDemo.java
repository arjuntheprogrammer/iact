class Time
{
private int hours,minutes;
public void getData(int hours,int minutes)
{
this.hours=hours;
this.minutes=minutes;
}
public void showData()
{
System.out.println("Hours is\t"+hours+"\tMinutes is\t"+minutes);
}
public void add(Time n1,Time n2)
{
int h;
h=(n1.minutes+n2.minutes)/60;
hours=n1.hours+n2.hours+h;
minutes=(n1.minutes+n2.minutes)%60;
}}
class ObjectDemo
{
public static void main(String ar[])
{
Time t1,t2,t3;
t1=new Time();
t2=new Time();
t3=new Time();
t1.getData(33,44);
t2.getData(44,55);
t3.add(t1,t2);
t1.showData();
t2.showData();
t3.showData();
}}