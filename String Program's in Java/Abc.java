
//How to count various kind and symbols
class Abc {
	public static void main(String args[]){

		String x = "ADITYA THE'S HACKER";
		char y[]=x.toCharArray();
		int size = y.length;
		int vowcnt=0;
		int conscnt=0;
		int splcnt=0;

		int i=0;

		while(i!=size)
		{
			if(y[i]>='A' && y[i]<='Z') //char count
			{
				if(y[i]=='A' || y[i]=='E' || y[i]=='I' || y[i]=='O' || y[i]=='U')//vowels count
				{
					vowcnt++;
				}
				else
				{
					conscnt++;
				}
			}
			else
			{
				splcnt++;			//special count means spaces ' and many more
			}
			i++;
		} 
		System.out.println(y);
		System.out.println("vowl count"+vowcnt);
		System.out.println("consonant count"+conscnt);
		System.out.println("special count"+splcnt);
	}
}