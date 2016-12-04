class Vehicle{  
int speed=10;
  Vehicle(){System.out.println("Vehicle is created");} 
Vehicle(int s){System.out.println(s+"sddgdVehicle is created");}   
}  
  
class Bike5 extends Vehicle{  
   
  Bike5(){  
super(10);
  System.out.println("Bike is created");  
  }  
  public static void main(String args[]){  
   Bike5 b=new Bike5();  
        
}  
}  