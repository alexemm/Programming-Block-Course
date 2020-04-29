
public class GeradeZahl {

	private int geradeZahl;

	public GeradeZahl(int i) {
		if (i % 2 != 0)
			i--;
		setGeradeZahl(i);
	}

	public GeradeZahl(GeradeZahl g) {
		this.setGeradeZahl(g.getGeradeZahl());
	}

	public int getGeradeZahl() {
		return geradeZahl;
	}

	public void setGeradeZahl(int r) {
		if (r % 2 != 0)
			r--;
		this.geradeZahl = r;

	}

	public String toStrings() {
		return ("" + geradeZahl);
	}
	
	public GeradeZahl getNachfolger() {
		this.geradeZahl+=2;
		return this;
	}
	
	public GeradeZahl getSum(GeradeZahl g2) {
		return g2;
	}

}
