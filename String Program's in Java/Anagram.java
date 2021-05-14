//Check String Are Anagram 

//Case : 1

import java.util.Arrays;
/*
class Anagram{
	public static void main(String[] args){
		String x = "BRAINY";
		String y = "BINARY";

		char a[] = x.toCharArray();
		char b[] = y.toCharArray();

		Arrays.sort(a);
		Arrays.sort(b);

		Boolean result = Arrays.equals(a,b);

		if(result == true)
		{
			System.out.println("String Are Anagram");
		}
		else
		{
			System.out.println("String Are Not Anagram");	
		}
	}
}
*/

//Case : 2

class Anagram{
	public static void main(String[] args){
		String x = "He iS AdiTYa";
		String y = "Is hE AyDtIA";

		x=x.replace("  ","");
		y=y.replace("  ","");

		x=x.toLowerCase();
		y=y.toLowerCase();

		char a[] = x.toCharArray();
		char b[] = y.toCharArray();

		Arrays.sort(a);
		Arrays.sort(b);
		
		Boolean result = Arrays.equals(a,b);

		if(result == true)
		{
			System.out.println("String Are Anagram");
		}
		else
		{
			System.out.println("String Are Not Anagram");	
		}	

	}
}