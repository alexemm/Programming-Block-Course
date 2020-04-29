import javax.swing.JOptionPane;

public class Klausuraufgaben {
	public static void main(String[] args) {
		// System.out.println(kleinsteZiffer());
		// printTripel();
		dreieck(2000);
	}

	public static int kleinsteZiffer() {
		String s = JOptionPane.showInputDialog("Gib Nummer");
		char c = 'a';
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) < c && s.charAt(i) <= '9' && s.charAt(i) >= '0')
				c = s.charAt(i);
		}
		if (c == 'a')
			return -1;
		return (int) c - 48;
	}

	public static void printTripel() {
		for (int x = 1; x < 100; x++) {
			for (int y = 2; y < 100; y++) {
				for (int z = 3; z < 100; z++) {
					if ((x < y) && ((x * x + y * y) == (z * z))) {
						System.out.println("(" + x + "," + y + "," + z + ")");
					}
				}
			}
		}
	}

	public static void dreieck(int n) {
		int zeile = 1;
		for (int i = 1; i <= n; i++) {
			for (int k = i - 1; k < n; k++)
				System.out.print(" ");
			int j;
			for (j = 1; j - 0 < (i + 1) / 2; j++)
				System.out.print(restZiffer(j) + " ");
			if (zeile % 2 == 0)
				System.out.print(restZiffer(j) + " ");
			for (j = (i + 1) / 2; j > 0; j--)
				System.out.print(restZiffer(j) + " ");
			zeile++;
			System.out.println("");
		}
	}

	public static int restZiffer(int x) {
		if (x < 10)
			return x;
		if (x > 99)
			return (x % 10) % 10;
		if (x > 999)
			return ((x % 10) % 10) % 10;
		return x % 10;
	}
}