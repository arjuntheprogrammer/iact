class Parent
{
void show1()
{
System.out.println("I am private show1 of Parent");
}
public void show2()
{
System.out.println("I am public show2 of Parent");
}}
class Child extends Parent
{
public void display()
{
show1();
show2();
}}

class In
{
public static void main(String ar[])
{
Child c1=new Child();
c1.display();
}
}