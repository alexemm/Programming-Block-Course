import java.math.*;

import javax.swing.JOptionPane;

public class Aufgabenuebungen11 {
	public static void main(String[] args) {
		//printPi(5);													//Aufgabe 11.1
		int[][] z= {{1,233,314143,4334,5142},{1,2424,31154,3143,56788}};
		printArray(z);													//Aufgabe 11.2
		String str=JOptionPane.showInputDialog("Gib ganze Zahl ein:");
		BigInteger c=new BigInteger(str);
		BigInteger d=new BigInteger(""+gibFakultaet(c));
		System.out.println(d);
		
	}
	
	public static void printPi(int decimals) {						//Aufgabe 11.1
		System.out.printf("%."+decimals+"f", Math.PI);
	}
	
	public static void printArray(int [][] arr) {					//Aufgabe 11.2
		if (arr==null) return;
		int zaehler=0;
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
				String str=""+arr[i][j];
				if(str.length()>zaehler) {
					zaehler=-(str.length())-1;
				}
			}
		}
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
				System.out.printf("%"+(zaehler-1)+"d",arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public static BigInteger gibFakultaet(BigInteger x) {		//Aufgabe 11.3
		BigInteger b=new BigInteger("1");
		for (int i=1;i<=Integer.parseInt(x.toString());i++) {
			BigInteger c=new BigInteger(""+i);
			b = b.multiply(c);
		}
		return b;
		}
}
