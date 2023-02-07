package com.javacodingproblems;

public class _02FirstNonRepeatCharacterInString {

	public static void main(String[] args) {

		String inputString = "11623";
		Character firstCharacter = inputString.charAt(0);
		Character resultCharacter = null;
					
		for (int i = 1; i < inputString.length(); i++) {
			if (inputString.charAt(i) != firstCharacter) {
				resultCharacter = inputString.charAt(i);
				break;
			}

		}
		
		System.out.println("First non-repeated character is " + resultCharacter);
	}

}