package special1;
public class Class1
{
public static void main(String[] args)
{
//Ex.No.01---->when we want to just Print a specific Result we use "break"Keyword.
//It does not print all Number is just print as per if() condition--->	
for(int i=0;i<=10;i++)
{
	if(i==5)
	{
		break;        //Its just printed all number before 5.
	}
	{
	System.out.println(i);
	}
	}
	System.out.println("End Of break Keyword Program"+"\n");
	
//Ex.No.02--->When we want to skip some number from the result we just put "continue" Keyword 	
		
		
		for(int i=0;i<=10;i++)
		{
			if(i==6)
			{
				continue;    //Its just skip the 6 & print all number.
			}
			else if(i==8)
			{
				continue;
			}
			System.out.println(i);
		}
System.out.println("End of continue Keyword Program"+"\n");
	
	
	
	
	
}
}
