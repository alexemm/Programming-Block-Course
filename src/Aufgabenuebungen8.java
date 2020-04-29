
public class Aufgabenuebungen8 {
	public static void main(String[] args) {
		int[][] a = new int[5][5];
		System.out.println(isSquare(a));
		System.out.println(getNameOfMonth(13));
		int[] b = { 1, 2, 3, 4, 5 };
		int[] c = { 5, 4, 3, 2, 1 };
		System.out.println(concat(b, c));
		System.out.println(getTrace2(getIndexSumArray(5, 5)));
	}

	public static double[][] getDoubleArray(int x, int y) { // Aufgabe 8.1
		double d[][] = new double[x][y];
		return d;
	}

	public static double getMinimum(double[] a) { // Aufgabe 8.2
		double min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}

	public static int getMinimumIndex(double[] a) {
		int minIndex = 0;
		double min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				minIndex = i;
			}
		}
		return minIndex;
	}

	public static boolean isSquare(int[][] test) { // Aufgabe 8.3
		int a = test.length;
		int b = test[0].length;
		for (int i = 1; i < test.length; i++) {
			if (test[i].length != test[i - 1].length) {
				return false;
			}
		}
		return (a == b);
	}

	public static boolean isSquare(double[][] test) {
		int a = test.length;
		int b = test[0].length;
		for (int i = 1; i < test.length; i++) {
			if (test[i].length != test[i - 1].length) {
				return false;
			}
		}
		return (a == b);
	}

	public static String getNameOfMonth(int no) { // Aufgabe 8.4
		String[] monate = { "Januar", "Februar", "Maerz", "April", "Mai", "Juni", "Juli", "August", "September",
				"Oktober", "November", "Dezember" };
		if (no > 12 || no < 1) {
			return (no + " ist keinem Monat zugeordnet.");
		}
		return monate[no - 1];
	}

	public static int[] concat(int[] x1, int[] x2) { // Aufgabe 8.5
		int[] x3 = new int[x1.length + x2.length];
		System.arraycopy(x1, 0, x3, 0, x1.length);
		System.arraycopy(x2, 0, x3, x1.length, x2.length);
		return x3;
	}

	public double getTrace(double[][] matrix) { // Aufgabe 8.6
		double sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			sum += matrix[i][i];
		}
		return sum;
	}

	public static int getTrace2(int[][] matrix) { // Aufgabe 8.6 (Test)
		int sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			sum += matrix[i][i];
		}
		return sum;
	}

	public static int[][] getIndexSumArray(int a, int b) { // Aufgabe 8.7
		int[][] x = new int[a][b];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				x[i][j] = i + j + 1;
			}
		}
		return x;
	}
}