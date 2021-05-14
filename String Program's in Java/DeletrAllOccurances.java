// delete all occurrences of a given character from a String

class DeletrAllOccurances
{
	public static void main(String[] args) {
		String x = "aditya";
		char y[] = x.toCharArray();
		int size = x.length();
		char key = 'a';

		int i = 0;

		String res = "";

		while(i != size)
		{
			if(y[i] != key)
			{
				res = res + y[i];
			}
			i++;
		}
	System.out.println(res);
	}
}