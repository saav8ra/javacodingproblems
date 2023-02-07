package com.javacodingproblems;

import java.util.HashMap;
import java.util.Map;

public class _12RemoveDuplicateCharacters {

	public static void main(String[] args) {

		String inputString = "There is a definite test going on here.";
		String outputString = "";
		Map<Character, Integer> charCounterMap = new HashMap<Character, Integer>();

		// Loop through the string, if a char value is not in the map add it to the
		// output string
		for (int i = 0; i < inputString.length(); i++) {
			char curChar = inputString.charAt(i);
			if (curChar == ' ') {
				outputString = outputString + curChar;
			} else {
				if (!charCounterMap.containsKey(curChar)) {
					charCounterMap.put(curChar, 1);
					outputString = outputString + curChar;
				}
			}
		}

		System.out.println("Output string : " + outputString);
	}

}
