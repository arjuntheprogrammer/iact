class StringDemo
{public static void main(String ar[])
{String x="aCT";
int a=x.compareTo("ACT");
System.out.println(a);
if(a==0)
System.out.println("Srings are equals");
else if(a>0)
System.out.println("first String is greater");
else
System.out.println("Second String is greater");

}}