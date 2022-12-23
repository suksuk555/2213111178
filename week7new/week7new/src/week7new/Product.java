package week7new;

public class Product {

	private String id;
	private int unit;
	private double price;


	public void setId(String ID) {
		id = ID;
	}
	public String getId() {
		return id;
	}
	public void setUnit(int UNIT) {
		unit = UNIT;
	}
	public int getUnit() {
		return unit;
	}
	public void setPrice(double PRICE) {
		price = PRICE;
	}
	public double getPrice() {
		return price;
	}
	public double calculate() {
		return price*unit;
	}
	public String setStatus(int UNIT) {
		if(UNIT < 5)
			return "LOW";

		else if (UNIT >= 5 && UNIT<= 50)
			return "NORMAL";
		return "HIGH";

	}
}


