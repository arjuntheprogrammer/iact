//an nested interface example


class A{

public interface Nestedif{
boolean isnotneg(int x);

}

}
class B implements A.Nestedif{
	public boolean isnotneg(int x)
	{
		return x<0 ? false:true;
	}
	
	
}
class Nestedifdemo{
	public static void main(String ar[])
	{
		A.Nestedif nif=new B();
		if(nif.isnotneg(10))
			System.out.println("10 not negative");
		if(nif.isnotneg(-12))
			System.out.println("not negative");
		
		
	}
	
}