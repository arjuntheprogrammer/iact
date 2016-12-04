class AAA
{public void show()
{class BBB
{public void msg()
{System.out.println("I AM LOCAL INNER CLASS");
}}
BBB b1=new BBB();
b1.msg();
}}
class LocalInnerDemo
{public static void main(String ar[])
{AAA a1=new AAA();
a1.show();
}}