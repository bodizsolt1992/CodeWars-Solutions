package kyu8;

public class ChromosomeCheck {
	public static String chromosomeCheck(String sperm) {
		if (sperm.charAt(1) == 'Y') {
			return "Congratulations! You're going to have a son.";
		} else if (sperm.charAt(1) == 'X') {
			return "Congratulations! You're going to have a daughter.";
		} else {
			return "";
		}
	}
}