package kyu6;

import java.util.Arrays;
import java.util.Comparator;

public class AreSame {

	public static boolean comp(int[] a, int[] b) {
		if (a == null || b == null || a.length != b.length) {
			return false;
		}
		Integer[] c = new Integer[a.length];
		for (int i = 0; i < b.length; i++) {
			c[i] = Integer.valueOf(a[i]);
		}
		Arrays.sort(c, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return Math.abs(o1) - Math.abs(o2);
			}
		});
		Arrays.sort(b);
		for (int i = 0; i < a.length; i++) {
			if (c[i] * c[i] != b[i]) {
				return false;
			}
		}
		return true;
	}
}