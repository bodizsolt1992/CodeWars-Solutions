package kyu6;

class LongestConsec {

	public static String longestConsec(String[] strarr, int k) {
		int n = strarr.length;
		int max = 0;
		if (n == 0 || k > n || k <= 0) {
			return "";
		}
		int[] array = new int[k];
		for (int i = 0; i < array.length; i++) {
			max += strarr[i].length();
			array[i] = i;
		}
		for (int i = 1; i <= strarr.length - k; i++) {
			int subLength = 0;
			for (int j = 0; j < k; j++) {
				subLength += strarr[i + j].length();
			}
			if (subLength > max) {
				max = subLength;
				for (int j = 0; j < k; j++) {
					array[j] = i + j;
				}
			}
			subLength = 0;
		}
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < array.length; i++) {
			result.append(strarr[array[i]]);
		}
		return result.toString();
	}

}