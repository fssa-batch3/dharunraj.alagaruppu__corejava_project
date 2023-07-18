package day08.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class CommaSeparatedDeptHashMap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int num = 3;
		HashMap<String, TreeSet<String>> countMap = new HashMap<>();// {key:[value1,value2]}
		while (count < num) {
			System.out.println("Enter the " + num + " values :");

			// HR,Suresh
			// IT,Ram
			// IT,Suresh
			// IT,Zara
			// Admin,Sunder

			String s = sc.nextLine();
			String[] ar = s.split(",");
			int check = 0;
			for (String deptName : countMap.keySet()) {// taking Keys of an object
				if (ar[0].equals(deptName)) {
					check = 1;
				}
			}
			if (check == 1) {
				TreeSet<String> arr = countMap.get(ar[0]);
				arr.add(ar[1]);
				countMap.put(ar[0], arr);
			} else {
				TreeSet<String> arr = new TreeSet<String>();
				arr.add(ar[1]);
				countMap.put(ar[0], arr);
			}
			count++;
		}
		System.out.println(countMap.keySet());
		for (String n : countMap.keySet()) {
			System.out.println(n + " : " + countMap.get(n));
		}
	}
}
