class First1
{
public First1()
{
System.out.println("I am const.. of First1 class");
}}
class Second1 extends First1
{
//intializer block
{
System.out.println("I am intializer block");
}
public Second1()
{
System.out.println("I am const.. of Second1 class");
}}
class ConstInDemo
{
public static void main(String ar[])
{new Second1();
}}
/*derivedclasscosntrutor()
{
super();
call to intializerblock
its own body

}*/
