 //To fing maximum occuring charecter

import java.util.*;

public class MaxOccurChar
{
	public static void main(String[] args)
	{

 		String x = "aditya_ashok_kumbhar";
 		char y[] = x.toCharArray();
 		int size = y.length;

 		Map<Character,Integer> map = new LinkedHashMap<>();

 		int i = 0;

 		while(i != size)
 		{
 			if(map.containsKey(y[i]) == false)
 			{
 				map.put(y[i],1);
 			}
 			else
 			{
 				int oldval=map.get(y[i]);
 				int newval=oldval+1;
 				map.put(y[i],newval);
 			}
 			i++;
 		}
 		
 		Set<Map.Entry<Character,Integer>> lmap = map.entrySet();
 		char maxkey = ' ';
 		int maxval = 0;
 		
 		for(Map.Entry<Character,Integer> data : lmap)
 		{
 			if(data.getValue() > maxval)
 			{
 				maxval=data.getValue();
 				maxkey=data.getKey();
 			}
 		}
 		System.out.println(maxkey);
 		System.out.println(maxval);
	}
}