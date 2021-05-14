//Check if a string contains all unique charecter using map data structure

import java.util.*;
public class CheckUniuueCHarecter
{
	public static void main(String[] args)
	{

		String x="SPIDERMAN";
		char y[]=x.toCharArray();
		int size=y.length;

		Map<Character,Integer> map = new LinkedHashMap<>();

		int i=0;

		while(i !=size)
		{
			if(map.containsKey(y[i]) == false)
			{
				map.put(y[i],1);
			}
			else
			{
				int oldval = map.get(y[i]);
				int newval = oldval+1;
				map.put(y[i],newval);
			}
			i++;
		}
	Set<Map.Entry<Character,Integer>> hmap=map.entrySet();
	for(Map.Entry<Character,Integer> data : hmap)
	{
		if(data.getValue()>1)
		{
			System.out.println("Doesnt COntain All unique Character");
			System.exit(0);
		}
	}
	System.out.println("COntain All unique Character ");
}
}