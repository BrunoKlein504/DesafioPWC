package application;

import java.util.Scanner;

public class Challenge1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a frase: ");
		String phrase = sc.nextLine();
		String[] output = phrase.split(" ");
		for (int i = output.length - 1; i >= 0; i--) {
			System.out.print(output[i]);
			if (i > 0) {
				System.out.print(" ");
			}
		}
		sc.close();
	}

}
