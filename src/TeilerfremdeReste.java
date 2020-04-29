
public class TeilerfremdeReste {
	public static void main(String[] args) {
		eulerPhi(2142000000);
	}

	public static void eulerPhi(int n) {
		System.out.println("Die teilerfremden Reste von " + n + " sind:");
		int anzahl = 0;
		for (int k = 1; k <= n; k++) {
			if (Aufgabenuebungen6.gcd(n, k) == 1) {
				System.out.println(k);
				anzahl++;
			}
		}
		System.out.println("Also ist phi(" + n + ")=" + anzahl);
	}
}