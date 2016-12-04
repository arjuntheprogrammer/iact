class Vehicle{  
  int speed=50;  
  
  void display(){  
   System.out.println("v"+speed);//will print speed of Bike   
  }  
}  
class Bike3 extends Vehicle{  
  int speed=100;  
  void display(){  
   System.out.println("b"+speed);//will print speed of Bike   
  }  
  public static void main(String args[]){  
   Vehicle b=new Bike3();  
   b.display();  
}  
}