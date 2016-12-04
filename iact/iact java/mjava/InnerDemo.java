class First
{
private String msg;
public class Inn
{
public void show()
{msg="hello";
System.out.println("Data is"+msg);
}
}
}
class InnerDemo
{
public static void main(String ar[])
{
First ff=new First();
First.Inn in=ff.new Inn();
in.show();
}
}