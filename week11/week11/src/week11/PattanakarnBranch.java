package week11;

public class PattanakarnBranch extends Product{
	
	public int payunit() {
		return super.getUnit()/2;
	}
	private int freeUnit() {
		return super.getUnit()-this.payunit();
	}
	@Override
	
	public String toString() {
		return "You buy "+this.payunit()+" units, get free"+this.freeUnit()+
				"units ("+this.getTotalprice()+")";
	}
}
