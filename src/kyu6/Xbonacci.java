package kyu6;

public class Xbonacci {
	public double[] tribonacci(double[] s, int n) {
		if (n < 3) {
			return new double[0];
		}
		if (n == 3) {
			return s;
		}
		double[] result = new double[n];
		double firstElement = s[0];
		double secondElement = s[1];
		double thirdElement = s[2];
		for (int i = 0; i < s.length; i++) {
			result[i] = s[i];
		}
		for (int i = 3; i < result.length; i++) {
			firstElement = result[i - 3];
			secondElement = result[i - 2];
			thirdElement = result[i - 1];
			result[i] = (firstElement + secondElement + thirdElement);
		}
		return result;
	}
}