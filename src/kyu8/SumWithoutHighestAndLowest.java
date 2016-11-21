package kyu8;

import java.util.Arrays;

public class SumWithoutHighestAndLowest {
	public static int sum(int[] numbers) {
		int result = 0;
		if (numbers == null || numbers.length < 3)
			return result;
		Arrays.sort(numbers);
		for (int i = 1; i < numbers.length - 1; i++)
			result += numbers[i];
		return result;
	}
}