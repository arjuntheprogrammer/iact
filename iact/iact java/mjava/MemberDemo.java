class Outer
{
private int n;
class Inner 
{
public void msg()
{n=100;
System.out.println("Member of inner class\t"+n);
}}}
class MemberDemo
{public static void main(String ar[])
{
Outer outer=new Outer();
Outer.Inner inn=outer.new Inner();
inn.msg();
}}