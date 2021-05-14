
public class Palindrome
{
	public static void main(String[] args)
	{
		String x = "too Hot tO HOot";
		x=x.replace(" ", "");  ///////////////////remove WhiteSpaces
		x=x.toLowerCase();////////////////////////convert upper case to lower case
		char y[] = x.toCharArray();
		int size = y.length;
		char a[] = new char[size];
		int i = 0;
		
		while(i!=size)
		{
			a[size-1-i] = y[i];
			i++;
		}
		
		i=0;
		while(i!=size)
		{
			if(a[i]!=y[i])
			{
				System.out.println("Not A Palindrome");
				System.exit(0);
			}
			else
			{
				i++;
				continue;
			}
		}
		System.out.println("Palindrome");
	}
}