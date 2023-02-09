import javax.swing.*;
public class ShapeDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] Radius = new double[5];
		double[] Height = new double[5];
		Cylinder[] cylinder = new Cylinder[5];
		for (int i = 0;i<cylinder.length;i++) {
			Radius[i] = Double.parseDouble(JOptionPane.showInputDialog("Input Radius"+(i+1)));
			Height[i] = Double.parseDouble(JOptionPane.showInputDialog("Input Height"+(i+1)));
			cylinder[i] = new Cylinder(Radius[i],Height[i]);
		}
		JOptionPane.showMessageDialog(null, "Cylinder 1"+","+cylinder[0].getVolume()+
				 "\nCylinder 2"+","+cylinder[1].getVolume()+
				 "\nCylinder 3"+","+cylinder[2].getVolume()+
				 "\nCylinder 4"+","+cylinder[4].getVolume()+
				 "\nCylinder 5"+","+cylinder[5].getVolume());
	}

}
