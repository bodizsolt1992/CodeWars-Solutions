package kyu6;

public class SpellingBee {

	public static int howManyBees(final char[][] hive) {
		if (hive == null || hive.length < 3) {
			return 0;
		}
		int count = 0;
		for (int i = 0; i < hive.length; i++) {
			for (int j = 0; j < hive[i].length; j++) {
				if (hive[i][j] == 'e') {
					if (j - 1 >= 0 && j + 1 < hive[i].length) {
						if (hive[i][j - 1] == 'b' && hive[i][j + 1] == 'e') {
							count++;
						}
						if (hive[i][j + 1] == 'b' && hive[i][j - 1] == 'e') {
							count++;
						}
					}
					if (i - 1 >= 0 && i + 1 < hive.length) {
						if (hive[i - 1][j] == 'b' && hive[i + 1][j] == 'e') {
							count++;
						}
						if (hive[i + 1][j] == 'b' && hive[i - 1][j] == 'e') {
							count++;
						}
					}
				}
			}
		}
		return count;
	}
}