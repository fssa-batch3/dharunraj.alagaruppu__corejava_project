package day08.misc;

import java.util.Map;
import java.util.TreeMap;

public class mapDemo {

	public static void main(String[] args) {

		
		Map <String,Integer> countMap = new TreeMap<>();
		String arrName[] = {"n", "b" , "a" ,"c" ,"c" , "a","v"};
		
		for(int i = 0 ; i < arrName.length;i++) {
			
			if(countMap.get(arrName[i]) == null) {
				countMap.put(arrName[i], 1);
			}
			
			else {
				
				int count = countMap.get(arrName[i]);
				count++;
				countMap.put(arrName[i], count);
			}
		}
		
		System.out.println(countMap);
	}

}
