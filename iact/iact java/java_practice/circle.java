class Operation{
int square(int n)
    {
        return n*n;
    }
}
class Circle{
Operation op;//aggre
double pi=3.14;
double area(int radius)
{
op=new Operation();
int rsquare= op.square(radius);
return pi*rsquare;

}
public static void main(String ar[])
{
Circle c=new Circle();
double result=c.area(3);
System.out.println(result);
}



}
