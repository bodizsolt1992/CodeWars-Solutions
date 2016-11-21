package kyu6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class TwistedPlanet {
	private static HashMap<Integer, Integer> twistedNumbersValue = new HashMap<>();
	static {
		int counter = 1;
		for (Integer i = -99; i < 100; i++) {
			char[] numChars = i.toString().toCharArray();
			String stoInsert = "";
			for (int j = 0; j < numChars.length; j++) {
				if (numChars[j] == '3')
					stoInsert += '7';
				else if (numChars[j] == '7')
					stoInsert += '3';
				else {
					stoInsert += numChars[j];
				}
			}
			twistedNumbersValue.put(Integer.valueOf(stoInsert), counter);
			counter++;
		}
	}

	public static Integer[] sortTwisted37(Integer[] array) {
		Integer[] arrayToSort = Arrays.copyOf(array, array.length);
		Arrays.sort(arrayToSort, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return twistedNumbersValue.get(o1) - twistedNumbersValue.get(o2);
			}

		});
		return arrayToSort;
	}
}
