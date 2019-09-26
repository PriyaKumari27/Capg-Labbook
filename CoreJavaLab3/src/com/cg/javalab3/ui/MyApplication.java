package com.cg.javalab3.ui;
import java.util.HashMap;

import com.cg.javalab3.dto.LabThree;

public class MyApplication {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,4,5,3,6};
		LabThree l = new LabThree();
		System.out.println(l.getSecondSmallest(arr));
		String[] stringArray = {"Hiie","zeee","Nice","Wow","john"};
		stringArray = l.getSortedArray(stringArray);
		for (String s: stringArray) {
			//System.out.println(s);
		}
		int[] numbers = {123,252,432,343,654,314,532};
		numbers = l.getSorted(numbers);
		System.out.println("-------------------------------");
		for(int num: numbers) {
			System.out.println(num);
		}

		char[] characters = {'b','c', 'd', 'c', 'e','c', 'c', 'a'};
		HashMap<String, Integer> map = l.countChar(characters);
		for (String key:map.keySet()) {
			System.out.println("The number of " + key + " = " + map.get(key));
		}
	}



}
