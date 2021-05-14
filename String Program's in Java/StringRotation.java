//if one string is a ratation of anothe string..

class StringRotation
{
	public static void main(String[] args) {
		String originalString = "ARADHYA";
		String keyString = "RADHYAS";

		String newString = originalString.concat(originalString);

		if(newString.contains(keyString))
		{
			System.out.println("Rotational String");
		}
		else
		{
			System.out.println("Non - Rotational String");	
		}
	}
}