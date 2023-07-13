package day06.practice;

import java.util.ArrayList;

import java.util.List;

public class RemoveDuplicate {

	public static void main(String[] args) {

		List<String> cityList = new ArrayList<String>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Mumbai");
		// cityList.add("Chennai");

		for (int i = 0; i < cityList.size(); i++) {

			for (int j = 0; j < cityList.size(); j++) {

				if (cityList.get(i) == cityList.get(j) && i != j) {
					cityList.remove(i);

				}
			}
		}

		System.out.println(cityList);

	}
}