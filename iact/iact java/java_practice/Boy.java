class Human
{
        String s1, s2;
        public Human()
        {
			System.out.println("HUMAN");
              s1 ="Super class";
              s2 ="Parent class";
        }
        public Human(String str)
        {
               s1= str;
               s2= str;
        }
}
class Boy extends Human
{
        public Boy()
        {
			
			System.out.println("boy");
              s2 ="Child class";
        }
        public void disp()
        {
               System.out.println("String 1 is: "+s1);
               System.out.println("String 2 is: "+s2);
        }
        public static void main(String args[])
        {
                Boy obj = new Boy();
                obj.disp();
        }
}