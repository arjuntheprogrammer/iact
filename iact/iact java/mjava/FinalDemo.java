class ABC
{
final int n=20;
public  void show()
{
n=100;
}
}
class XYZ extends ABC
{
public void show()
{}
}
class FinalDemo
{
public static void main(String ar[])
{
new XYZ();
}
}