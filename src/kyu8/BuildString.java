package kyu8;

public class BuildString {
	public static String buildString(String... args) {
		StringBuffer result = new StringBuffer();
		result.append("I like ");
		for (String s : args) {
			result.append(s + ", ");
		}
		result = result.delete(result.length() - 2, result.length());
		result.append("!");
		return result.toString();
	}
}