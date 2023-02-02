import javax.swing.*;

public class Shop100Baht {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product1 arnupab = new Product1() ;
		arnupab.setUnit(10);
		
		int check = JOptionPane.showConfirmDialog(null, "is the program run on Pattakarn Branch");
		if(check == 0 ) {
			arnupab = new PattanakarnBranch();
		}
		arnupab.setUnit(Integer.parseInt(JOptionPane.showInputDialog("Input the number of product : ")));
		JOptionPane.showMessageDialog(null, arnupab);
		
	}

}
