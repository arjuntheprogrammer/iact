import java.util.*;
class Demo2
{


public Demo2(){
System.out.println("this is default constructor");
}

/*
public Demo2(double	 num){
System.out.println(num+ " =>FLOAT this is paramat cons.");


}*/
public Demo2(int num){
System.out.println(num+ " =>INT this is paramat cons.");

}

}

class Demo1{
	
	public static void main(String ar[])
	{
		Demo2 ob1=new Demo2();
		
		Demo2 ob2=new Demo2((int)5.0);
		
		
	}
	
	
}