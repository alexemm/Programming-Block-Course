
public class Karten {
	private char farbe;
	private int anzahlSymbole;
	private char fuellung;
	private char symbol;
	
	public Karten (char farbe,int anzahlSymbole, char fuellung, char symbol) {
		this.setFarbe(farbe);
		this.setAnzahlSymbole(anzahlSymbole);
		this.setFuellung(fuellung);
		this.setSymbol(symbol);
	}

	public char getFarbe() {
		return farbe;
	}

	public void setFarbe(char farbe) {
		this.farbe = farbe;
	}

	public int getAnzahlSymbole() {
		return anzahlSymbole;
	}

	public void setAnzahlSymbole(int anzahlSymbole) {
		this.anzahlSymbole = anzahlSymbole;
	}

	public char getFuellung() {
		return fuellung;
	}

	public void setFuellung(char fuellung) {
		this.fuellung = fuellung;
	}

	public char getSymbol() {
		return symbol;
	}

	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}
	
	public String toString() {
		return (""+this.getFarbe()+this.getAnzahlSymbole()+this.getFuellung()+this.getSymbol());
	}
}
