package week10;

public class TestStudent {

	public static void main(String[] args) {
		
		Student st = new Student("Suthichai","121212");
		System.out.println(st);
		
		st.setAddress("25 ddsds");
		System.out.println(st);
		System.out.println(st.getName());
		System.out.println(st.getAddress());
		
		st.addCourseGrade("int107", 25);
		st.addCourseGrade("int108", 79);
		st.addCourseGrade("msc202", 69);
		st.printGrade();
		
		System.out.println("the average grade is %.2f%n"+st.getAverageGrade());



	}

}
