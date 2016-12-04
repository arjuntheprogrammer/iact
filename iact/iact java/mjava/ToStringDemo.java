class Employ
{private int empno,sal;
private String ename;
public void getData(int eno,String en,int salary)
{empno=eno;
ename=en;
sal=salary;
}
public void showData()
{System.out.println("Employee No is\t\t"+empno);
System.out.println("Employee Name is\t\t"+ename);
System.out.println("Employee Salary is\t\t"+sal);
}
public String toString()
{return "Employee NO is\t"+empno+"\tEmployee Name is\t"+ename+"\t Salary is\t"+sal;
}}
class ToStringDemo
{public static void main(String ar[])
{Employ e1=new Employ();
e1.getData(1,"ABC",14000);
System.out.println(e1);
}}
/*
class MyString
{public static void main(String ar[])
{int a=50;
System.out.pritnln("Value of a is\t"+a);

======System.out.println("Value of a is\t"+a.toString());
}
}*/