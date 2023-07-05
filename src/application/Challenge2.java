package application;

public class Challenge2 {

	public static void main(String[] args) {
		String input = "Hello, World!";
		String output = input.toLowerCase();
		StringBuilder final_output = new StringBuilder();

		for (int i = 0; i < output.length(); i++) {
			char letter = output.charAt(i);
			if (letter == ' ' || output.indexOf(letter) == i) {
				final_output.append(input.charAt(i));
			}
		}

		System.out.println(final_output);
	}

}
