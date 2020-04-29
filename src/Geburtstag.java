
public class Geburtstag {

	private String monat;
	private int tag;
	private String[] monate = {"Januar","Februar","Maerz","April","Mai","Juni","Juli","August","September","Oktober","November","Dezember"};
	private int[] tage = {31,29,31,30,31,30,31,31,30,31,30,31};
	private int monatZ;
	
	public Geburtstag (int d,int m) {
		if (m>0&&m<13&&d>0&&d<=tage[m-1]) {
			setMonat(monate[m-1]);
			setTag(d);
			
		} else {
			System.out.println("Dein Ernst?") ;
		}
	}
	
	public Geburtstag (Geburtstag g) {
		this.setMonat(g.getMonat());
		this.setTag(g.getTag());
	}

	public String getMonat() {
		return monat;
	}

	public void setMonat(String m) {
		this.monat = m;
	}

	public int getTag() {
		return tag;
	}

	public void setTag(int t) {
		this.tag = t;
	}
	
	public String toStrings() {
		return ("Dein Geburtstag ist am: "+tag+". "+monat+".");
	}
	
	
}
