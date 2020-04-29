
public class Punkt {
	
	private double px;
	private double py;
	
	public static void main(String[] args) {
		
	}
	
	public Punkt(double x,double y) {
		px=x;
		py=y;
	}
	
	public void setX(double newX) {
		px=newX;
	}
	
	public double getX() {
		return this.px;
	}
	
	public void setY(double newY) {
		py=newY;
	}
	
	public double getY() {
		return this.py;
	}
	
	public String toStrings() {
		return ("x: "+this.px+" y: "+this.py);
	}
	
	public void schiebe(double dx, double dy) {
		this.setX(this.getX()+dx);
		this.setY(this.getY()+dy);
	}
	
	
	
}
