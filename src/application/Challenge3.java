package application;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge3 {

	public static void main(String[] args) {

		String input = "babad";
		String largestPalindrome = findLargestPalindrome(input);
		System.out.println("Largest palindrome: " + largestPalindrome);
	}

	private static String findLargestPalindrome(String input) {
		// Remover caracteres não alfanuméricos e converter para letras minúsculas
		String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

		String largestPalindrome = "";
		int maxLength = 0;

		// Encontrar todos os substrings e verificar se são palíndromos
		for (int i = 0; i < cleanedInput.length(); i++) {
			for (int j = i + 1; j <= cleanedInput.length(); j++) {
				String substring = cleanedInput.substring(i, j);
				if (isPalindrome(substring) && substring.length() > maxLength) {
					maxLength = substring.length();
					largestPalindrome = substring;
				}
			}
		}

		return largestPalindrome;
	}

	private static boolean isPalindrome(String input) {
		// Usar expressão regular para verificar se a string é um palíndromo
		String reversed = new StringBuilder(input).reverse().toString();
		Pattern pattern = Pattern.compile(reversed);
		Matcher matcher = pattern.matcher(input);
		return matcher.matches();
	}
}
