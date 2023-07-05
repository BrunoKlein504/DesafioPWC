package application;

public class Challenge1 {

	public static void main(String[] args) {
		String phrase = "Hello, World! OpenAI is amazing.";
		String[] output = phrase.split(" ");
		for (int i=output.length - 1; i>=0; i--) {
			System.out.print(output[i]);
			if (i > 0) {
				System.out.print(" ");
			}
		}
	}

}
