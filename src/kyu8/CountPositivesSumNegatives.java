package kyu8;

public class CountPositivesSumNegatives {
	public static int[] countPositivesSumNegatives(int[] input) {
		int[] result = new int[2];
		int[] wrongInputResult = new int[0];
		if (input == null || input.length == 0)
			return wrongInputResult;
		result[0] = 0;
		result[1] = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] > 0) {
				result[0]++;
			}
			if (input[i] < 0) {
				result[1] += input[i];
			}
		}
		return result;
	}
}