package day09.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortingNumber {

	public static void main(String[] args) {

		ArrayList<Integer> num = new ArrayList<>();

		// 8 9 45 12 1

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of input : ");
		int n = sc.nextInt();
		System.out.println("Start enter value : ");
		for (int i = 0; i < n; i++) {
			num.add(sc.nextInt());

		}
		sc.close();

		// Below the code for collection method
		Collections.sort(num);
		System.out.println("Your sorted array is : " + num);

	}

}
