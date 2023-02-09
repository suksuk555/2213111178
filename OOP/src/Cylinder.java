
public class Cylinder extends Circle{
	private double height;
	
	public Cylinder(double radius,double height) {
		super(radius,null);
		this.height = height;
		//
	}
	public double getHeight() {
		return height;
	}
	public double getVolum() {
		return super.getArea()*height;
	}
	public double getArea() {
		return Math.PI*(height+super.getRadius());
	}
	public String toString() {
		return "height = "+getHeight()+" , "+super.toString();
	}
	
	
}
