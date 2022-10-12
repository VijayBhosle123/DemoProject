package special1;  //USE OF Super Keyword & Super Class & Child Class
//Always put main method in the System defined Class Only.

class A       //Super Class
{
	void read()
	{
		System.out.println("This is Super Class");
	}
}
class B extends  A    //Child Class
{
  void read()
   {
	super.read();    //for Super Class printing in main Method
	System.out.println("This is Chilled Class"); //for child Class Printing in main Method
   }
}

public class AB   //Main Class of Package
{
public static void main(String[] args)  //Main Method
{
      B x=new B();
      x.read();
     
}
}
