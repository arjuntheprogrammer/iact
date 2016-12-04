class Paren
{
private  int a=50;
static class Child
{
public void msg()
{
System.out.println("helllllllll"+a);
}}
}
class DemoStaticInner
{
public static void main(String ar[])
{
Paren.Child p1=new Paren.Child();
p1.msg();
}}