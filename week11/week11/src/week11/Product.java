package week11;

public class Product {
	private int unit;
	
	
	
	public void setUnit(int unit) {
		this.unit = unit;
		
	}
	public int getUnit() {
		return unit;
	}
	public int getTotalprice() {
		return getUnit()*100;
	}
	public String toString() {
		return "you buy "+getUnit()+" unit ("+getTotalprice()+")";
	}
}
