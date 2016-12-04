class Shape
{public void draw()
{System.out.println("I am draw of shape");
}}
class Circle extends Shape
{public void draw()
{System.out.println("I am draw of circle");}
}
class Square extends Shape
{public void draw()
{System.out.println("I am draw of square");}
}
class Rectangle extends Shape
{public void draw()
{System.out.println("I am draw of rectangle");}
}
class OverDemo
{public static void main(String ar[])
{Shape shape;
Shape sh=new Shape();
Circle cir=new Circle();
Rectangle rect=new Rectangle();
Square sq=new Square();
System.out.println("\n\n====Pointing to own class\n\n");
shape=sh;
shape.draw();
System.out.println("\n\n====Pointing to circle class\n\n");
shape=cir;
shape.draw();
System.out.println("\n\n====Pointing to rectangle class\n\n");
shape=rect;
shape.draw();
System.out.println("\n\n====Pointing to square class\n\n");
shape=sq;
shape.draw();
}}