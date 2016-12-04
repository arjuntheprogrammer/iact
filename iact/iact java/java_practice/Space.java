import java.util.*;
class Queue{
	void push(String s)
	{
		str[count++]=s;
	}
	int count=0;
	String str[]=new String[50];
}
class Space{
		public static void main(String ar[])
		{
			Queue q=new Queue();
			
			Scanner s=new Scanner(System.in);
			String str=s.nextLine();
			String st="asfaasfadf";
			int l=str.length();
			int count[]=new int[l+10];
			for(int i=0; i<str.length();i++)
			{
			count[i]=0;
			}
			
			int c=0,max=0,n=0;
			char xx;
			for(int i=0; i<str.length();i++)
			{
				
				if(str.charAt(i)==' ')
				{
					q.push(st);
					count[c]++;
					c=0;	n++;				
				}
				else
				{//System.out.println(str.charAt(i));
					xx=str.charAt(i);
					
				c++;
						if(c>max)
					max=c;}
					
			}
			count[c]++;
					
			for(int i=0; i<str.length();i++)
			{
				//System.out.println(count[i]);
		
			}
			for(int i=0; i<=max;i++)
			System.out.println(count[i]);

		}


}