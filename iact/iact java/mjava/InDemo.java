class Fir
{public void show()
{System.out.println("I am show1 of Fir class");
}}
class Sec extends Fir
{public void display()
{System.out.println("I am display of sec");
}}
class InDemo
{public static void main(String ar[])
{Sec s1=new Sec();
s1.display();
s1.show();
}}