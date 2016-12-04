interface One
{void show1();
void show2();
}
interface Two
{void show3();}
interface Three extends One,Two
{void show4();
}
class Multi implements Three
{public void show1()
{}
public void show2()
{}
public void show3(){}
public void show4(){}
}
class MultiInterDemo
{public static void main(String ar[])
{Multi m1=new Multi();
m1.show3();
}}