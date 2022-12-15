import javax.swing.JOptionPane;
public class Lab_Example602_2 {
	static String[] deptName = {"Accounting","HR","Sales","Innovation"};
	static boolean deptwasFound = false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dept = JOptionPane.showInputDialog("Enter a department name");
		for(int i=0;i<deptName.length;i++) {
			if(dept.equalsIgnoreCase(deptName[i])) {
				deptwasFound = true;
			}
		}
		if(deptwasFound) {
			JOptionPane.showInputDialog(null,dept + "was found in the list");
		}
		else {
			JOptionPane.showInputDialog(null,dept + "was not found in the list");
		}

	}

}
