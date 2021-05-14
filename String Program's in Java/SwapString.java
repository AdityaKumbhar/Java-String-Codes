//Swaping  2 Strings
public class SwapString
{
	public static void main(String[] args) {
		String x = "aditya";
		String y = "kumbhar";
		String temp = "";

		System.out.println("Before Swapping x :" +x);
		System.out.println("Before Swapping x :" +y);

		temp = x;
		x = y;
		y = temp;

		System.out.println("After Swapping x :" +x);
		System.out.println("After Swapping x :" +y);
	}
}