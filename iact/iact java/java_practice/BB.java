class AA
{
AA()
{
System.out.println("default");
}

AA(int a)
{
System.out.println("para");
}

}

class BB extends AA
{
	BB()
	{
	super(5);
		System.out.println("bb");
	}
	BB(int x)
	{
			this();		
		
	System.out.println("start");

	System.out.println("end");
	}

public static void main(String ar[])
{
BB ob = new BB(5);
}


}