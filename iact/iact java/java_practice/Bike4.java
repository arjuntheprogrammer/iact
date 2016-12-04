 
class Vehicle{  
  int speed=50;  

  
  Vehicle(){
	System.out.println("default veh");
 }
  Vehicle(int s){
	System.out.println("veh s="+s);
 }
  
  }
  
class Bike4 extends Vehicle{
Bike4()
{

	super(super.speed);

System.out.println(super.speed+"=super speed");


	}
   
//Vehicle obb=new Vehicle(50);	

  int speed=100;  
      
  void display(){  
   System.out.println(super.speed+"     "+speed);
   //will print speed of Vehicle now  
  }  
  public static void main(String args[]){  
   Bike4 b=new Bike4();  
   b.display();  
     
}  
}  