import javax.swing.JOptionPane;

public class Aufgabenuebungen4 {
		public static void main(String[] args) {
			//System.out.println(getFactorial(10));					//Aufgabe 4.1
			//System.out.println(doubleBirthday(102));				//Aufgabe 4.2
			//System.out.println(getPi(909));							//Aufgabe 4.3
			//System.out.println(getNextPartialSum(5));				//Aufgabe 4.4
			//summe();												//Aufgabe 4.5
			//durchschnitt();
			//ascii();												//Aufgabe 4.6
			//System.out.println(getFibonacciNumber(3));				//Aufgabe 4.7
			//System.out.println(fibonacciAusgabe(30));
			System.out.println(getFactorialRek(5));
			System.out.println(getFibonacciNumberRek(5));
		}
		
		public static int getFactorial(int x) {		//Aufgabe 4.1
		if (x < 1)
			throw new ArithmeticException("Fehler. Fehler. Fehler. Bzzt.");
			int fak=1;
			for (int i=1;i<=x;i++) {
				fak*=i;
			}
			return fak;
		}
		public static long getFactorialRek(long x) {
			if (x < 0 ) 
				throw new ArithmeticException("Does not exist!");
			return x == 0 ? 1 : x * getFactorialRek(x-1);
		}
		
		public static double doubleBirthday(int size) {	//Aufgabe 4.2
			if (size<1) throw new ArithmeticException("n eht nicht kleiner 1.");
			double wars=1;
			double wars2=1;
			for(int i=1;i<=size;i++) {
				wars2*=((365-i+1)/365.);
			}
			return wars-wars2;
		}
		
		public static double getPi(double n) {				//Aufgabe 4.3
			if(n<1) throw new ArithmeticException("n kann nicht kleiner 1 sein.");
			boolean vorzeichenPositiv=true;
			double pi=0;
			for(int i=1;i<=n;i+=2) {
				if (vorzeichenPositiv==true) {
					pi+=(1./i);
					vorzeichenPositiv=false;
				} else {
					pi-=(1./i);
					vorzeichenPositiv=true;
				}
			}
			return pi*4;
		}
		
		public static int getNextPartialSum(int v) {		//Aufgabe 4.4
			if(v<1) throw new ArithmeticException("n kann nicht kleiner 1 sein.");
			int n0=0;
			for (int i=1;n0<v;i++) {
				n0+=i;
			}
			return n0;
		}
		
		public static void summe() {								//Aufgabe 4.5
			int sum=0;
			int zahl=Integer.parseInt(JOptionPane.showInputDialog("Zahl eingeben."));
			while(zahl!=0) {
				sum+=zahl;
				zahl=Integer.parseInt(JOptionPane.showInputDialog("Zahl eingeben."));
			}
			System.out.println("Gesamtsumme: "+sum);
		}
		
		public static void durchschnitt() {
			int sum=0;
			int zahl=Integer.parseInt(JOptionPane.showInputDialog("Zahl eingeben."));
			int zaehler=0;
			while(zahl!=0) {
				sum+=zahl;
				zahl=Integer.parseInt(JOptionPane.showInputDialog("Zahl eingeben."));
				zaehler++;
			}
			System.out.println("Gesamtsumme: "+(sum/(double)zaehler));
		}
		
		public static void ascii() {							//Aufgabe 4.6
			int zahl=Integer.parseInt(JOptionPane.showInputDialog("Zahl eingeben."));
			while (zahl!=0) {
				char c= (char)zahl;
				System.out.println(c);
				zahl=Integer.parseInt(JOptionPane.showInputDialog("Zahl eingeben."));
			}
		}
			
		public static int getFibonacciNumber(int n) {			//Aufgabe 4.7
			if(n<1) throw new ArithmeticException("n kann nicht kleiner 1 sein.");
			int fibo1=1;
			int fibo2=1;
			for (int i=1;i<n;i++) {
				int hilf = fibo2;
				fibo2+=fibo1;
				fibo1=hilf;
			}
			return fibo1;
		}
		
		public static int getFibonacciNumberRek(int n) {
			if ( n < 1) {
				throw new ArithmeticException("");
			}
			return n == 1 || n == 2 ? 1 : getFibonacciNumberRek(n-1) + getFibonacciNumberRek(n-2); 
		}
		
		public static String fibonacciAusgabe(int wvZahl) {
			String Ausgabe = "";
			for (int i=1;i<=wvZahl;i++) Ausgabe += getFibonacciNumber(i) + " ";
			return Ausgabe;
		}
		
}
