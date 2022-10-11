package special1;

public class Y 
{
public void  M1(boolean i)
{
   System.out.println("M1(boolean i) of Class Y");
 }
public void M1(int i, int j)
{
	System.out.println("M1(int i, int j) of Class Y");
 }
public int M2(char c,int j)
{
	System.out.println("M2(return int) of Class Y");
            return 'A';	
 }

public static void main(String[] args)
{
	
//without use of extends keyword we can call all method of both Class with there own object creation---> 
	
	X y=new X();
	
    y.M1();
	y.M1(20);
	y.M2();
	  
	Y x =new Y();

	x.M1(false); 
    x.M1(20,30);
    x.M2('A',20);
    
	
	
//this will be possible when we use extends Keyword to call all method present in both class with Child class object--->	
//  Y x =new Y();
//  x.M1(false); 
//	x.M1(20,30);
//	x.M2('A',20);
//	x.M1();
//	x.M1(20);
//	x.M2();
 
    
	  
	  
}
}