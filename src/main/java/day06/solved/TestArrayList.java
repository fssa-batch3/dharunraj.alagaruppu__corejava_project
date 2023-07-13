package day06.solved;

import java.util.ArrayList;

public class TestArrayList {
	 
    //without using generics
    public static void main(String[] args) {
     
        // Store the city names in the List
        ArrayList<String> cityList  = new ArrayList<String>();
        cityList.add("Chennai");
        cityList.add("Bangalore");
        cityList.add("Mumbai");
         
        // Display the city names
        for (Object o : cityList) {
            String cityName = (String) o; // TypeCast object to String
            System.out.println(cityName);           
        }
 
    }
 
}

