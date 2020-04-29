
public class Dominokette {

	private Dominostein[] dk;

	public Dominokette(Dominostein d) {
		dk = new Dominostein[1];
		dk[0] = d;
	}

	public String toString() {
		String str = "";
		for (int i = 0; i < dk.length; i++) {
			str += (dk[i] + " ");
		}
		return str;
	}

	public void fuegeRechtsAn(Dominostein d) {
		if (!(d.getD1() == dk[dk.length - 1].getD2())) {
			d.dreheUm();
			if (!(d.getD1() == dk[dk.length - 1].getD2())) {
				throw new NumberFormatException("Dein Dominostein passt nicht in die Kette");
			}
		}
		Dominostein[] dk2 = new Dominostein[dk.length + 1];
		for (int i = 0; i < dk.length; i++) {
			dk2[i] = dk[i];
		}
		dk2[dk.length] = d;
		dk = dk2;
	}
}
