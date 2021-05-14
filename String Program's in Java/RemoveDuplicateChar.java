//Remove Duplictate Charecter in String


import java.util.*;

public class RemoveDuplicateChar
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
 		String res = "";
 		
 		for(Map.Entry<Character,Integer> data : lmap)
 		{
 			res = res + data.getKey();
 		}
 		System.out.println(res);
	}
}