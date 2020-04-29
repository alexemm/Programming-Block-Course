import javax.swing.JOptionPane;

public class Aufgabenuebungen {
		public static void main(String[] args) {
			//aufgabe21();
			//aufgabe22(5);
			//System.out.println(getFahrenheit(38));
			System.out.println(getDoubleRandom(1.,6.));
			System.out.println(getIntRandom(1,6));
			
			
		}
		
		public static void aufgabe21() {						// Aufgabe 2.1
			String s = JOptionPane.showInputDialog("Gib Zahl ein:");
			int r = Integer.parseInt(s);
			System.out.println("Zahl: "+s+", Reziproke Zahl: "+1./Integer.parseInt(s));
		}
		
		public static void aufgabe22(double x) {				//Aufgabe 2.2
			System.out.println(Math.abs(x));
			System.out.println(Math.log1p(x));
			System.out.println(Math.sinh(x));
		}
		
		public static double getFahrenheit(double celsius) {	//Aufgabe 2.3
			double fahrenheit= 9./5.*celsius+32;
			return fahrenheit;
		}
		
		public static double getDistance(double x1, double y1, double x2, double y2) { //Aufgabe 2.4
			double p = Math.sqrt(((x1-x2))*(x1-x2))+((y1-y2)*(y1-y2));
			return p;
		}
		
		public static double getDoubleRandom(double min, double max) { //Aufgabe 2.5
			double x=Math.random()*(max-min)+min;
			return x;
		}
		
		public static int getIntRandom(int min, int max) {
			int x=(int)(Math.random()*(max-min)+min);
			return x;
		}
		
}
