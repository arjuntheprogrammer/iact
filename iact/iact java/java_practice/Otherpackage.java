package p2;

class Otherpackage{

Otherpackage()
{
p1.Protection p=new p1.Protection();
System.out.println("other package cons.");

//class and package only
//System.out.println("n="+p.n);

//class only
//System.out.println("n_pri="+p.n_pri);

//class, subclass , and package only
//System.out.println("n_pro="+p.n_pro);


System.out.println("n_pub="+p.n_pub);



}


}