//How To print first non repeatd charecter

import java.util.*;
 public class FirstNonRepeatedChar
 {
 	 public static void main(String[] args) 
 	{
 		String x = "aditya";
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
 		for(Map.Entry<Character,Integer> data : lmap)
 		{
 			if(data.getValue() == 1)
 			{
 				System.out.println(data.getKey());
 				System.exit(0);
 			}
 		}
 	}
 }