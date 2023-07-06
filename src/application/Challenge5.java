package application;

public class Challenge5 {

	public static void main(String[] args) {
		
		String input = "racecar";
		StringBuilder result = new StringBuilder(input.toLowerCase());
		boolean output = result.reverse().toString().equals(input.toLowerCase());
		
		System.out.println(output);
	}

}
