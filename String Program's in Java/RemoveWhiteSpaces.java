//Remove white spaces space as well as tab

public class RemoveWhiteSpaces
{
	public static void main(String[] args)
	{
		String x = "adi ty    a ash o      k    kum  b ha r";
		x=x.replaceAll("\\s","");
		System.out.println(x);
	}
}