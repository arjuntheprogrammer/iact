interface Animal
{
void run();
void eat();
void sound();
}
class Bird implements Animal
{
public void run()
{
System.out.println("Fur...FUR...");
}
public void eat()
{
System.out.println("dana pani...");
}
public void sound()
{System.out.println("chi..hic...chi..");
}}
class Lion implements Animal
{public void run()
{System.out.println("Bhagam..bhag....");
}
public void eat()
{System.out.println("masoom insann...");
}
public void sound()
{System.out.println("dahar....dahar...");
}}
class Horse implements Animal
{public void run()
{System.out.println("dhumak...dhuak...");
}
public void eat()
{System.out.println("chana jor garam");
}
public void sound()
{System.out.println("hin...hin....");
}}
class InterDemo
{public static void main(String ar[])
{Animal animal;
Lion lion=new Lion();
Bird bird=new Bird();
Horse horse=new Horse();
System.out.println("Pointing to .....Lion");
animal=lion;
animal.eat();
animal.run();
animal.sound();
System.out.println("Pointing to .....Bird");
animal=bird;
animal.eat();
animal.run();
animal.sound();
System.out.println("Pointing to .....Horse");
animal=horse;
animal.eat();
animal.run();
animal.sound();
}}