//example of initializer block
class Me
{
int a,b;
{
a=100;
System.out.println("I am initialize block1");
}
{
a=1000;
System.out.println("I am initialize block2");
}
public Me()
{System.out.println("const..invoke");
}
public void getData(int x)
{
a=x;
}
public void showData()
{
System.out.println("Vlue of a is"+a);
}}

class InitDemo
{
public static void main(String ar[])
{Me m1=new Me();
m1.showData();
}}