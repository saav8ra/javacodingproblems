package com.javacodingproblems;

import java.util.HashMap;
import java.util.Map;

public class _01CountDuplicateCharactersInString {

	public static void main(String[] args) {

		String inputString = "121111111134554321";
		Map<Character, Integer> resultMap = new HashMap<Character, Integer>();
			
		for (int i = 0; i < inputString.length(); i++) {
			
			char ch = inputString.charAt(i);
			if (resultMap.containsKey(ch)) {
				resultMap.put(ch, resultMap.get(ch) + 1);
			} else {
				resultMap.put(ch, 1);
			}
		}
		
		System.out.println("Result " + resultMap);
	}

}
