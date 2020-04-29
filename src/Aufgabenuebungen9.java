import javax.swing.JOptionPane;

public class Aufgabenuebungen9 {
	public static void main(String[] args) {
		// System.out.println(getCharCount("Hallo.",'.')); //Aufgabe 9.1
		// System.out.println(getCapitalString()); //Aufgabe 9.2
		// System.out.println(asciiTable()); //Aufgabe 9.3
		// System.out.println(reverse("Donaudampfschiffahrtgesellschaftskapitaen"));
		// //Aufgabe 9.4
		//System.out.println(clozeText(JOptionPane.showInputDialog("Gib Text ein, woraus ein Lueckentext entsteht: "))); //Aufgabe 9.5
		// System.out.println(ausgabeInt(getParameters())); //Aufgabe 9.6
		 System.out.println(newGermanOrthography(JOptionPane.showInputDialog("Gib String mit vielen sch ein: "))); //Aufgabe 9.7
		// System.out.println(ausgabeInt(getDigitCount(-10354892))); //Aufgabe 9.8
	}

	public static int getCharCount(String s, char c) { // Aufgabe 9.1

		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				sum++;
			}
		}
		return sum;
	}

	public static String getCapitalString() { // Aufgabe 9.2
		String str = JOptionPane.showInputDialog("Gib was ein:");
		String s = "";
		for (int i = 0; i < str.length(); i++) {
			s += (char) (str.charAt(i) - 32);
		}
		return s;
	}

	public static String asciiTable() { // Aufgabe 9.3
		String str = "";
		for (int i = 0; i < 128; i++) {
			str += i + " " + (char) i + "\n";
		}
		return str;
	}

	public static String reverse(String s) { // Aufgabe 9.4
		String str = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			str += s.charAt(i);
		}
		return str;
	}

	public static String clozeText(String s) { // Aufgabe 9.5
		int counter = 0;
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			if (counter < 3) {
				str += s.charAt(i) + "";
				counter++;
			} else {
				str += " ";
				counter = 0;
			}
		}
		return str;
	}

	public static int[] getParameters() { // Aufgabe 9.6
		String str = JOptionPane.showInputDialog("Gib Zahlen mit einem Komma getrennt ein:");
		str += ",";
		int zaehler = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ',')
				zaehler++;
		}
		int[] x = new int[zaehler];
		int j = 0;
		int i = 0;
		for (; i < str.length(); i++) {
			String hilf = "";
			while ((str.charAt(i) != ',') && (i < str.length())) {
				hilf += str.charAt(i);
				i++;
			}
			x[j] = Integer.parseInt(hilf);
			j++;
		}
		return x;
	}

	public static String ausgabeInt(int[] x) {
		String str = "";
		for (int i = 0; i < x.length; i++) {
			str += x[i] + " ";
		}
		return str;
	}

	public static String newGermanOrthography(String s) { // Aufgabe 9.7
		String str = "";
		s += " ";
		for (int i = 0; i < s.length() - 1; i++) {
			String r = "";
			if ((i + 1 < s.length() - 1) & (s.charAt(i + 1) == 'c')) {
				if ((i + 2 < s.length() - 1) & (s.charAt(i + 2) == 'h')) {
					if (s.charAt(i) == 'S') {
						r = "Sh";
					} else if (s.charAt(i) == 's') {
						r = "sh";
					}
				}
			}
			if (r.equals("")) {
				str += s.charAt(i);
			} else {
				str += r;
				i += 2;
			}
		}
		return str;
	}

	public static int[] getDigitCount(int n) { // Aufgabe 9.8
		int[] x = new int[10];
		String s = "" + Math.abs(n);
		for (int i = 0; i < s.length(); i++) {
			x[(int) s.charAt(i) - 48]++;
		}
		return x;
	}
}
