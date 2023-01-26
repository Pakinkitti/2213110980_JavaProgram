
public class Student {
	private String name;
	private String address;
	private String[] courses;
	private int[] grades;
	private int numCouses;
	private static final int MAX_COURSE = 30;
	
	public Student(String name,String address) {
		this.name = name;
		this.address = address ;
		courses = new String[MAX_COURSE];
		grades = new int [MAX_COURSE];
		numCouses = 0;
	}
	public String getName() {
		return this.name;
	}
	public String getAddress() {
		return this.address;
	}
	public void setAddress(String string) {
		this.address = address;
	}
	public String toString() {
		return getName() + " (" + getAddress()+")";
	}
	public void addCourseGrade(String course, int grade) {
		courses[numCouses] = course ;
		grades[numCouses] = grade ;
		++numCouses ; 
	}
	public void printGrade() {
		System.out.print(name);
		for(int i = 0;i<numCouses;i++) {
			System.out.print(" " + courses[i]+":" +grades[i]);
			
		}
		System.out.println();
	}
	public double getAverageGrade() {
		int sum = 0;
		for(int i =0;i<numCouses;i++) {
			sum = grades[i];
		}
		return (double)sum/numCouses;
	}
}

