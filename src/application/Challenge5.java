package application;

public class Challenge5 {

	public static void main(String[] args) {

		String word1 = "radar";
		String word2 = "ana";
		String word3 = "hello";
		String word4 = "racecar";

		System.out.println(verificarAnagramaPalindromo(word1)); // true
		System.out.println(verificarAnagramaPalindromo(word2)); // true
		System.out.println(verificarAnagramaPalindromo(word3)); // false
		System.out.println(verificarAnagramaPalindromo(word4)); // true
	}

	public static boolean verificarAnagramaPalindromo(String palavra) {
		String palavraInvertida = new StringBuilder(palavra).reverse().toString();

		if (palavra.equals(palavraInvertida)) {
			return true;
		} else {
			return false;
		}
	}
}