class A
{int x,y;
public A(int k,int p)
{x=k;
y=p;
System.out.println("Parametized const.. of A class\t"+x+" "+y);
}}
class B extends A
{private String n;
public B(int a1,int a2,String n)
{
A(a1,a2);
this.n=n;
System.out.println("Derived class const.....\t"+n);
}}
class ParaInDemo
{public static void main(String ar[])
{new B(33,55,"iact");
}}