//Verify a String contains only integer

//Approch : 1
/*
class StringContainsInteger{
	public static void main(String[] args){
	String x = "98689";
	char y[] = x.toCharArray();
	int size = y.length;
	int i = 0;

	while(i !=size){
		if(y[i] > '0' && y[i] <= '9')
		{
			i++;
		}
		else
		{
			System.out.println("Not an Integer String" );
			System.exit(0);
		}
	}
	System.out.println("Integer String");	
	}
	
}
*/

//Approch : 2

class StringContainsInteger{
	public static void main(String[] args){
	String x = "9868F";
	//char y[] = x.toCharArray();
	int size = x.length();
	int i = 0;

	while(i !=size){
		if(x.charAt(i)>='0' && x.charAt(i)<='9')	//if(y[i] > '0' && y[i] <= '9')
		{
			i++;
		}
		else
		{
			System.out.println("Not an Integer String" );
			System.exit(0);
		}
	}
	System.out.println("Integer String");	
	}
	
}