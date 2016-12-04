class MeClass
{private int a,b;
public MeClass()
{a=200;
b=300;
System.out.println("default Const....invoke");
}
public MeClass(int x,int y)
{a=x;
b=y;
System.out.println("\ntwo ineger param cont... with "+a+"  "+b);
}
public MeClass(int n)
{a=b=n;
System.out.println("\none  ineger parameter... with "+a+"  "+b);
}
public MeClass(MeClass m)
{a=m.a;
b=m.b;
System.out.println("\nObject para...cont... with "+a+"  "+b);
}
public void getData(int x,int y)
{a=x;
b=y;}
public void showData()
{System.out.println(a+"\t\t"+b);
}}
class ConstDemo
{public static void main(String ar[])
{MeClass m1=new MeClass();
MeClass m2=new MeClass(44,55);
MeClass m3=new MeClass(3333);
MeClass m4=new MeClass(m2);
MeClass m5=new MeClass(new MeClass(2222,3333));
}}