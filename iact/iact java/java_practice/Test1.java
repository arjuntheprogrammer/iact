import java.util.*;
class Company{
String cname;

public void setcname(String name)
{
	cname=name;
}
public String getcname()
{
	return cname;
}

}


class Departments extends Company{

String dname;
public void setdname(String name)
{
	dname=name;
}

public String getdname()
{
	return dname;
}




}
class Employees extends Departments{
String ename;
int sal;


Employees(String name,int sal1){
	ename=name;
	sal=sal1;
	
}
public void diplayall()
{
	System.out.println("name="+ename+" dname="
	+this.getdname()+
	" cname="+this.getcname()+" sal="+sal);
	
	
}



}
class Test1{
	public static void main(String ar[])
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter no of employees=");
	int ne=s.nextInt();
	Employees emp[]=new Employees[ne];
		for(int i=0;i<ne;i++)
		{
				
	System.out.println("enter name of employees=");
	String name=s.next();
	System.out.println("enter sal of employees=");
	int sal=s.nextInt();
	System.out.println("enter comp of employees=");
	String comp=s.next();
	System.out.println("enter dname of employees=");
	String dname=s.next();
	Employees e=new Employees(name,sal);
	e.setdname(dname);
	e.setcname(comp);
	
	emp[i]=e;
	emp[i].diplayall();
	
		}
	int a[]=new int[ne+10];
	
	for(int i=0;i<ne;i++)
	{
		a[i]=0;	
	}
	for(int i=0;i<ne;i++)
	{
		if(a[i]==0)
		{
			a[i]=1;
			System.out.println(emp[i].getcname()+"is company name");
			String cn=emp[i].getcname();
			for(int j=i;j<ne;j++)
			{
				if(cn.equals(emp[j].getcname()))
				{
					a[j]=1;
			System.out.println(emp[j].getdname()+"is dept name");
			
				}
			}
		}
	}
	
	
			System.out.println("xxxxxxxxxxxxxxxxxxxxxxx");
	
	
	for(int i=0;i<ne;i++)
	{
		a[i]=0;	
	}
	for(int i=0;i<ne;i++)
	{
		if(a[i]==0)
		{
			a[i]=1;
			System.out.println(emp[i].getcname()+"is company name");
			String cn=emp[i].getcname();
			for(int j=i;j<ne;j++)
			{
				if(cn.equals(emp[j].getcname()))
				{
					a[j]=1;
					if(emp[j].sal>10)
			System.out.println(emp[j].ename+"is  ename");
			
				}
			}
		}
	}
	
	}


}