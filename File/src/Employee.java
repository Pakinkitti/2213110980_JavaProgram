
public class Employee {
	private String dept;
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDept(String dept) {
		return dept;
		
	}
	public void header() {
		for(int i=1;i <=80;i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
