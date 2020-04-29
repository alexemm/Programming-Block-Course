import javax.swing.*;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println(zahlenBis(1000));
		System.out.println(fakultaet(20));
		System.out.println(fibonacciAusgabe(30));
		System.out.println(1 / 2.);
		System.out.println(modulo(14, 12));
		System.out.println(Eingabe());
		System.out.println(probe());
	}

	public static String zahlenBis(int zahl) {
		String g = " ";
		for (int i = 1; i <= zahl; i++)
			g += i + " ";
		return g;
	}

	public static long fakultaet(int zahl) {
		if (zahl == 1) {
			return zahl;
		}
		if (zahl == 0) {
			return 1;
		}
		return (fakultaet(zahl - 1) * zahl);
	}

	public static long fibonacci(int zahl) {
		if (zahl <= 2)
			return 1;
		else
			return (fibonacci(zahl - 1) + fibonacci(zahl - 2));
	}

	public static String fibonacciAusgabe(int wvZahl) {
		String Ausgabe = "";
		for (int i = 1; i <= wvZahl; i++)
			Ausgabe += fibonacci(i) + " ";
		return Ausgabe;
	}

	public static String Eingabe() {
		String str;
		str = JOptionPane.showInputDialog("Bitte Text eingeben.");
		return str;
	}

	public static int probe() {
		String name;
		int zahl = 0;
		name = JOptionPane.showInputDialog("Bitte Zahl eingeben.");
		zahl = Integer.parseInt(name);
		return (zahl + 1);
	}

	public static int modulo(int zaehler, int nenner) {
		int hilf = zaehler / nenner;
		hilf *= nenner;
		hilf = zaehler - hilf;
		return hilf;
	}
}
