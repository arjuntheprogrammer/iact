abstract class AClass
{
public void show1()
{
System.out.println("I am show1 of Aclass");
}
public void show2()
{
System.out.println("I am show2 of Aclass");
}
public abstract void show3();
public abstract void show4();
public abstract void show5();
}

class ChildAbstract extends AClass
{
public void show3()
{
System.out.println("Implementation of abstract show3");
}
public void show4()
{
System.out.println("Implementation of abstract show4");
}
public void show5()
{
System.out.println("Implementation of abstract show5");
}}
class AbstractDemo
{
public static void main(String ar[])
{
ChildAbstract cb=new ChildAbstract();
cb.show3();
}}