class XXX{
	public XXX()
	{
		System.out.println("XXXXX");
	}
	public XXX(int sss)
	{
		System.out.println(sss+"=sss  XXXXX");
	}
	
int s=111;
void display(){
System.out.println(s+"=s");
}
	
	
}
class ABC extends XXX
{
int s=100;
ABC()
	{
		super(9999);
		System.out.println("aaaa");
	}
public ABC(int ss)
	{
		System.out.println(ss+"=ss  xxaaa");
	}

	void display(){
System.out.println(s+"=s");
}

}
class BCD extends ABC{
BCD()
{
	super(5);
}
int s=999;

void display(){
System.out.println(s+"=s");
}

public static void main(String ar[])
{
 //ABC obj =new ABC();
// obj.display();


// ABC obj2 =new BCD();
 //obj2.display();
 
BCD obj1 =new BCD();
 //obj1.display();


}

}