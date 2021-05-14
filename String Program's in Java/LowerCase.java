public class LowerCase
{
	public static void main(String[] args)
	{
		String x = "aditya ashok kumbhar";
		char y[] = x.toCharArray();
		int size = y.length;
		
		int i = 0;
		
		/*
		//logic will work as with white sapces
		while(i!=size)
		{
			y[i] =  (char)(y[i]+32);
			i++;
		}
		*/

		//
		/*while(i!=size)
		{
			if(y[i] != ' ')
			{
				y[i] =  (char)(y[i]-32);
				i++;
			}
		}*/

		y[i] =  (char)(y[i]-32);

		while(i != size)
		{
			if(y[i] == ' ')
			{
				y[i+1] = (char)(y[i+1]-32);
			}
			i++;
		}

		System.out.println(x);
		System.out.println(y);
	}
}