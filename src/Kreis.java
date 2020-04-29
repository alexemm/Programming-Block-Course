
public class Kreis {
	
	private double radius;
	private Punkt mittelpunkt;
	
	public Kreis(double radius, Punkt mittelpunkt) {
		this.setMittelpunkt(mittelpunkt);
		this.setRadius(radius);
	}
	
	public Kreis(Kreis k2) {
		this.setMittelpunkt(k2.getMittelpunkt());
		this.setRadius(k2.getRadius());
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Punkt getMittelpunkt() {
		return mittelpunkt;
	}

	public void setMittelpunkt(Punkt mittelpunkt) {
		this.mittelpunkt = mittelpunkt;
	}
	
	public double getFlaeche() {
		return (this.getRadius()*this.getRadius()*Math.PI);
	}
	
	public double getUmfang() {
		return (this.getRadius()*2*Math.PI);
	}
	
	public double getAbstand(Punkt p) {
		return Math.abs(-(Math.sqrt(Math.pow(p.getX()-this.getMittelpunkt().getX(), 2))+Math.pow(p.getY()-this.getMittelpunkt().getY(), 2))+this.getRadius());
	}
	
}
