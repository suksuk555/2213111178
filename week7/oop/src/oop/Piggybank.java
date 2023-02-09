package oop;

public class Piggybank {

	public int one;
	public int two;
	public int five;
	public int ten;
	public int size;
	
	public void setPiggyBank(int s) {
		clear();
		size = s;
	}
	public int getPiggyBank() {
		return size;
	}
	public void clear() {
		one = two = five = ten = 0;
	}
	public int getTotal() {
		return one = (two*2)+(five*5)+(ten*10);
	}
	public void addOne(int c) {
		if(getTotal()+c <=size) {
			one += c;
		}
		else {
			System.err.println("Piggy Bank Full");
		}
	}
	public void addtwo(int c) {
		if(getTotal()+c <=size) {
			two += c;
		}
		else {
			System.err.println("Piggy Bank Full");
		}
	}
	public void addfive(int c) {
		if(getTotal()+c <=size) {
			five += c;
		}
		else {
			System.err.println("Piggy Bank Full");
		}
	}
	public void addten(int c) {
		if(getTotal()+c <=size) {
			ten += c;
		}
		else {
			System.err.println("Piggy Bank Full");
		}
	}
	

}
