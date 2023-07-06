 package application;

import java.util.Locale;

public class Challenge4 {

	public static void main(String[] args) {
		
		String input = "hello. how are you? i'm fine, thank you.";
		StringBuilder output = new StringBuilder();
		
		boolean first_letter = true;
		
		for (char c : input.toCharArray()) {
			if(first_letter && Character.isLetter(c)) {
				output.append(Character.toUpperCase(c));
				first_letter = false;
			}
			else {
				output.append(c);
			}
			if(c == '.' || c == '!' || c == '?') {
				first_letter = true;
			}
		}
		
		System.out.println(output.toString());
		
	}

}
