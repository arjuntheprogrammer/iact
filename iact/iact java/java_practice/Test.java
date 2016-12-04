class Person{
public int num;
}
public class Test{
public void dolt(int i, Person p)
{
i=5; p.num=8;
}
public static void main(String ar[])
{
int x=0;
Person p=new Person();

new Test().dolt(x,p);
System.out.println(x+"   "+p.num);
}


} 