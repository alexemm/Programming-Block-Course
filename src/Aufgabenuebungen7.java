import javax.swing.JOptionPane;
import java.util.*;
import java.awt.*;

public class Aufgabenuebungen7 {
	public static void main(String[] args) {
		//Bruch br = eingabeBruch();						//Aufgabe 7.1a)
		//System.out.println(br);	
		//Bruch bs = groessererBruch(br);					//Aufgabe 7.1b)
		//System.out.println(bs);
		//aufgabe72();										//Aufgabe 7.2
		//aufgabe73();										//Aufgabe 7.3
		//Scanner sc = new Scanner(System.in);				//Aufgabe 7.4
		//String s=sc.nextLine();
		//sc.close();
		//System.out.println(s);
		int x1=Integer.parseInt(JOptionPane.showInputDialog("Punkt 1:x")); //Aufgabe 7.5a)
		int y1=Integer.parseInt(JOptionPane.showInputDialog("Punkt 1:y"));
		int x2=Integer.parseInt(JOptionPane.showInputDialog("Punkt 2:x"));
		int y2=Integer.parseInt(JOptionPane.showInputDialog("Punkt 2:y"));
		Point p1 = new Point(x1,y1);
		Point p2 = new Point(x2,y2);
		System.out.println(p1);
		System.out.println(p2);
		p1.setLocation(x1+10, x2+10);										//Aufgabe 7.5b)
		p2.setLocation(x2+10, y2+10);
		System.out.println(p1);
		System.out.println(p2);
		double dis=p1.distance(p2);											//Aufgabe 7.5c)
		System.out.println(dis);
	}
	
	public static Bruch eingabeBruch() {				//Aufgabe 7.1a)
		int zaehler = Integer.parseInt(JOptionPane.showInputDialog("Zaehler"));
		int nenner = Integer.parseInt(JOptionPane.showInputDialog("Nenner"));
		Bruch br = new Bruch(zaehler,nenner);
		return br;
	}
	
	public static Bruch groessererBruch(Bruch bf) {		//Aufgabe 7.1b)
		Bruch gr = new Bruch(1,10);
		bf.add(gr);
		return bf;
	}
	
	public static void aufgabe72() {
		Bruch a = new Bruch(1,3);
		Bruch b = a;
		Bruch c = new Bruch(a);
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(b==c);
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(b.equals(c));
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	public static void aufgabe73() {
		Random r = new Random();
		for (int i=0;i<100;i++)
		System.out.println(r.nextInt(101)+" ");
		
	
}
}
