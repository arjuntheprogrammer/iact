abstract class Parent 
{
public abstract void show1();
public abstract void show2();
} 
class AnonymousDemo
{public static void main(String ar[])
{
Parent p1=new Parent()
{
public void show1()
{
System.out.println("I am show1 of abstract classs");
}
public void show2()
{System.out.println("I am show2 of abstract classs");
}};
p1.show1();
p1.show2();
}}

/*class Child extends Parent
{
public void show1()
{}
public void show2()
{}
}

Child c1=new Child();
c1.show1();
c1.show2();
*/