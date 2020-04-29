
public class Komplex {
	
	double realteil;
	double imaginaerteil;
	
	public static void main(String[] args) {
		
	}
	
	public Komplex(double r, double i) {
		realteil=r;
		imaginaerteil=i;
	}
	
	public Komplex(Komplex k) {
		this.realteil=k.getRealteil();
		String string=k.getImaginaerteil().substring(0,k.getImaginaerteil().length()-1); 
		double i=Double.parseDouble(string);
		imaginaerteil=i;
	}
	
	public void setXRealteil(double newR) {
		realteil=newR;
	}
	
	public double getRealteil() {
		return this.realteil;
	}
	
	public void setImaginaerteil(double newI) {
		imaginaerteil=newI;
	}
	
	public double getImaginaerteild() {
		return (this.imaginaerteil);
	}
	
	public String getImaginaerteil() {
		return (this.imaginaerteil+"i");
	}
	
	public String toStrings() {
		return (realteil+ "+" + imaginaerteil +"i");
	}
	
	public double getBetrag() {
		return(Math.sqrt(imaginaerteil*imaginaerteil+this.getRealteil()*this.getRealteil()));
	}
	
	public void konjugiertKomplex() {
		imaginaerteil=-imaginaerteil;
	}
	
	public Komplex getKonjugiertKomplex() {
		this.konjugiertKomplex();
		return this;
	}
	
	public void add(Komplex k) {
		this.realteil=this.realteil+k.realteil;
		this.imaginaerteil=this.imaginaerteil+k.getImaginaerteild();
	}
	
	public void mult(Komplex k) {
		this.realteil=this.realteil*k.realteil-this.imaginaerteil*k.imaginaerteil;
		this.imaginaerteil=this.realteil*k.imaginaerteil+this.imaginaerteil*k.imaginaerteil;
	}
	
}
