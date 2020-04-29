
public class Dominostein {
	private int d1;
	private int d2;
	
	public Dominostein (int do1,int do2) {
		if (do1>=0&&do1<7&&do2>=0&&do2<7) {
			setD1(do1);
			setD2(do2);
		} else {
			System.out.println("Geht nicht.");
		}
	}
	
	public Dominostein (Dominostein d) {
		this.setD1(d.getD1());
		this.setD2(d.getD2());
	}

	public int getD1() {
		return d1;
	}

	public void setD1(int do1) {
		if (do1>=0&&do1<7) {
		this.d1 = do1;
		} else { 
			return;
		}
	}

	public int getD2() {
		return d2;
	}

	public void setD2(int do2) {
		if (do2>=0&&do2<7) {
		this.d2 = do2;
		} else {
			return;
		}
	}
	
	public String toString() {
		return ("["+getD1()+","+getD2()+"]");
	}
	
	public void dreheUm() {
		int hilf = this.getD1();
		this.setD1(this.getD2());
		this.setD2(hilf);
	}
	
	public int[] getValues() {
		int[] a = {this.getD1(),this.getD2()};
		return a;
	}
}
