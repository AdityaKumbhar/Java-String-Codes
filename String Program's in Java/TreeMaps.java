//Accessing Data in Map Data Structure 
//Application TreeMap In Java

import java.util.*;

public class TreeMaps{
	public static void main(String[] args){
		String x="ADITYA_KUMBHAR";
		char y[]=x.toCharArray();
		int size=y.length;

		Map<Character,Integer> map = new TreeMap<>();
		int i=0;
		while(i != size){
			if(map.containsKey(y[i]) == false){
				map.put(y[i],1);
			}
			else{
				int oldval = map.get(y[i]);
				int newval = oldval + 1;
				map.put(y[i],newval);
			}
			i++;
		}
		Set<Map.Entry<Character,Integer>> hmap = map.entrySet();
		for(Map.Entry<Character,Integer> data : hmap){
			System.out.print(data.getKey());
			System.out.println(data.getValue());
		}
	}
}