 class Veh{
 int s=100;
 int speed=99999;
  
  Veh(){
	System.out.println("default veh");
 }
  Veh(int s){
	System.out.println("veh s="+s);
 }
 
 
 }
class Vehicle extends Veh{  
 
  
  Vehicle(){
	  super(5);
	 // super(super.speed);
	System.out.println("default vehicle");
 }
  Vehicle(int s){
	System.out.println("vehicle s="+s);
 }
  
  }
  
class Bike77 extends Vehicle{
Bike77()
{

	///super(super.speed);

//System.out.println(super.speed+"=super speed");


	}
   
//Vehicle obb=new Vehicle(50);	

  int speed=100;  
      
  void display(){  
   //System.out.println(super.speed+"     "+speed);
   //will print speed of Vehicle now  
  }  
  public static void main(String args[]){  
   Bike77 b=new Bike77();  
   //b.display();  
     
}  
}  