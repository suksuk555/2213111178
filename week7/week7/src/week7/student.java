package week7;

public class student {
	
	
	private String name;
	private int score;
	
	
	public void setName(String Name) {
		name = Name;
	}
	public String getName() {
		return name;
	}
	public void setScore(int Score) {
		score = Score;
	}
	public int getScore() {
		return score;
	}
	public boolean checkScore() {
		if(score >= 0 && score <=100) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isPass() {
		if(score>=50) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean A() {
		if(score>=80&&score<=100) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean Bp() {
		if(score>=75&&score<=79) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean B() {
		if(score>=70&&score<=74) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean Cp() {
		if(score>=65&&score<=69) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean C() {
		if(score>=60&&score<=64) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public String findGrade(int score) {
		if(score>=80&&score<=100) {
			return "A";
		}
		if(score>=75&&score<=79) {
			return "B+";
		}
		if(score>=70&&score<=74) {
			return "B";
		}
		if(score>=65&&score<=69) {
			return "C+";
		}
		if(score>=60&&score<=64) {
			return "C";
		}
		if(score>=55&&score<=59) {
			return "D+";
		}
		if(score>=50&&score<=54) {
			return "D";
		}
		if(score>=0&&score<=49) {
			return "F";
		}
		return "";
	}
		
	}


