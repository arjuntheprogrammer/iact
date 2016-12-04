
public class Testsleep extends Thread{
	public void run(){
		for(int i=0;i<=5;i++){
			try{
				Thread.sleep(500);
			}
			catch(InterruptedException e){
				System.out.print(e);
				
			}
			System.out.print(i);
		}
		
	}
		public static void main(String ar[])
		{
			Testsleep t1=new Testsleep();
			Testsleep t2=new Testsleep();
			t1.start();
			t2.start();
		}
}
