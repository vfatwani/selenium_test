package test;

public class PrimeNumber
{
	
	public boolean checker(Integer pn)
	{ //int i=2;
		for (int i=2; i <= (pn/2) ;i++ )
		{
			if(pn % i == 0)
			{
			return false;
			
		}
	}
	
			
			return true;
				
		
}
		
				
	}



