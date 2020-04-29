
public class Schachstellung {

	private char[][] schachstellung;
	private String stellung;

	public Schachstellung() {
		schachstellung = new char[17][33];
		for (int i = 0; i < schachstellung.length; i++) {
			for (int j = 0; j < schachstellung[i].length; j++) {
				if (i % 2 == 0 && j % 4 == 0) {
					schachstellung[i][j] = '+';
				}
				if (i % 2 == 0 && j % 4 != 0) {
					schachstellung[i][j] = '-';
				}
				if (i % 2 == 1 && j % 4 == 0) {
					schachstellung[i][j] = '|';
				}
			}
		}
	}

	public void setzeSchachstellung(String s) {
		checkForExceptions(s);
		int a = 0;
		int b = 0;
		char c = ' ';
		for (int i = 0; i < s.length(); i++) {
			switch (i%3) {
			case 0:
				c = s.charAt(i);
				break;
			case 1:
				a = (int) (s.charAt(i) - 48);
				break;
			case 2:
				b = (int) (s.charAt(i) - 48);
				schachstellung[1 + (a - 1) * 2][4 * b - 2] = c;
				a = 0;
				b = 0;
				break;
			}
		}
		stellung=s;
	}

	public String toString() {
		String str = "";
		for (int i = 0; i < schachstellung.length; i++) {
			for (int j = 0; j < schachstellung[i].length; j++) {
				str += (schachstellung[i][j]);
			}
			str += "\n";
		}
		return str;
	}

	public void checkForExceptions(String str) {
		for (int i = 0; i < str.length(); i += 3) {
			switch (str.charAt(i)) {
			case 'K':
			case 'D':
			case 'T':
			case 'S':
			case 'L':
			case 'B':
			case 'k':
			case 'd':
			case 't':
			case 's':
			case 'l':
			case 'b':
				break;
			default:
				throw new IllegalArgumentException("Falsche Figur (falsche Buchstaben) oder falsche Syntax!");
			}
		}
		for (int i = 0; i < str.length(); i++) {
			if (i % 3 == 0)
				i++;
			if (!((int) (str.charAt(i)) - 48 < 9 && (int) (str.charAt(i)) - 48 > 0)) {
				throw new IllegalArgumentException("Koordinaten existieren nicht!");
			}
		}
		boolean[][] feldBelegt = new boolean[8][8];
		int a;
		int b;
		int i = 0;
		while (i < str.length()) {
			if (i % 3 == 0)
				i++;
			a = (int) (str.charAt(i)) - 49;
			i++;
			b = (int) (str.charAt(i)) - 49;
			i++;
			if (feldBelegt[a][b] == true) {
				throw new IllegalArgumentException("Doppelte Feldbelegung!");
			} else {
				feldBelegt[a][b] = true;
			}
		}
	}

	public String getStellung() {
		return stellung;
	}

}
