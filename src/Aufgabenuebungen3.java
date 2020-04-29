
public class Aufgabenuebungen3 {
	public static void main(String[] args) {
		System.out.println(getTemperatureText(40.1));
		System.out.println(getWaitingTime(1, 25));
		System.out.println(solveLinearEquation(5, 6));
		System.out.println(getPostage(125));
		System.out.println(getNameOfMonth(12));
	}

	public static String getTemperatureText(double temp) { // Aufgabe 3.1
		if (temp <= 10) {
			return ("kalt");
		} else if (temp <= 25) {
			return ("lauwarm");
		} else if (temp <= 40) {
			return ("warm");
		} else {
			return ("heiss");
		}
	}

	public static int getWaitingTime(int h, int min) { // Aufgabe 3.2
		if (min == 0 || min == 30) {
			return 0;
		} else if (min < 30) {
			return 30 - min;
		} else {
			return 60 - min;
		}
	}

	public static double solveLinearEquation(double a, double b) { // Aufgabe
																	// 3.3
		if (a == 0) {
			throw new ArithmeticException("Gleichung nicht loesbar");
		}
		return (-b / a);
	}

	public static int getPostage(int order) {
		if (order < 100000) {
			return 550;
		} else if (order < 200000) {
			return 300;
		} else {
			return 0;
		}
	}

	public static String getNameOfMonth(int nr) {
		switch (nr) {
		case 1:
			return "Januar";
		case 2:
			return "Februar";
		case 3:
			return "Maerz";
		case 4:
			return "April";
		case 5:
			return "Mai";
		case 6:
			return "Juni";
		case 7:
			return "Juli";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "Oktober";
		case 11:
			return "November";
		case 12:
			return "Dezember";
		default:
			throw new ArithmeticException("Zahl nicht gueltig. #obdubehindertbisthabeichgefragt");

		}
	}
}
