
public class Aufgabenuebungen6 {
	
	public static void main(String[] args) {
		System.out.println(gcd(90, 30)); // Aufgabe 6.1
		zahlendreieck(5); // Aufgabe 6.2
		zahlendreieck2(5);
		printCircle(5);
	}

	public static int gcd(int a, int b) { // Aufgabe 6.1
		if (a < 1 || b < 1)
			throw new ArithmeticException("Fehler. Fehler. Fehler. Bzzt.");
		while (b != 0) {
			if (a > b) {
				a -= b;
			} else {
				b -= a;
			}
		}
		return a;
	}

	public static void zahlendreieck(int x) { // Aufgabe 6.2
		if (x < 1)
			throw new ArithmeticException("Fehler. Fehler. Fehler. Bzzt.");
		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("%2d", i);
			}
			System.out.println();
			;
		}
	}

	public static void zahlendreieck2(int x) { // Aufgabe 6.2
		if (x < 1)
			throw new ArithmeticException("Fehler. Fehler. Fehler. Bzzt.");
		for (int i = 1; i <= x; i++) {
			for (int vor = x; vor >= i; vor--) {
				System.out.printf(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.printf("%2d", i);
			}
			System.out.println();
			;
		}
	}

	public static void printCircle(int Radius) {
		int r=Radius;
		char[][] kreis = new char[2+r/2+r][2+r/2+r];
		int x=0;
		int y=0;
		int mxy=r;
		
		for (;x<r*2+1;x++) {
			for (;y<r*2+1;y++) {
				if ((Math.sqrt((mxy-x)*(mxy-x)+(mxy-y)*(mxy-y)))==r) {
					kreis[x][y]='#';
				}
			}
		}
		String str="";
		for (int i=0;i<r*2;i++) {
			str+=kreis[i][0];
		}
		System.out.println(str);
	}

	}
