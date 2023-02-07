package com.javacodingproblems;

public class _03ReversingLettersAndWords {

	public static void main(String[] args) {
		reverseSentence();
		reverseWords();
	}

	private static void reverseSentence() {
		String inputString = "This is a test of the reverse sentence program";
		int i = inputString.length();
		int len = inputString.length();

		// Reverse each word in the array
		StringBuilder dest = new StringBuilder(len);

		for (i = (len - 1); i >= 0; i--) {
			dest.append(inputString.charAt(i));
		}

		System.out.print(dest + "\n");
	}

	private static void reverseWords() {
		String inputString = "This is a test of the reverse words program";
		String resultString = "";
		
		String[] wordArray = inputString.split(" ");		
		int arrayCount = wordArray.length;

		for (int i = 0; i < arrayCount; i++) {
			
			String word = wordArray[i];
			
			int j = word.length();
			int len = word.length();

			// Reverse each word in the array
			StringBuilder revWord = new StringBuilder(len);

			for (j = (len - 1); j >= 0; j--) {
				revWord.append(word.charAt(j));
			}
			
			resultString = resultString + revWord + " ";
		}

		System.out.print(resultString);
	}
}
