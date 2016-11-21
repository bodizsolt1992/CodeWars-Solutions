package kyu8;

public class EvenOrOdd {
	public static String even_or_odd(int number) {
		String result = (number % 2 == 0) ? "Even" : "Odd";
		return result;
	}
}