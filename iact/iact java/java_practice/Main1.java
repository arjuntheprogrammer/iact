class Parent{

void display()
{
System.out.println(a+"parent");

}

int a=10;

}

class Child extends Parent{

void display()
{
System.out.println(a+"child");

}




}


class Main1{

public static void main(String ar[])
{

Parent ob=new Child();
ob.display();
}


}