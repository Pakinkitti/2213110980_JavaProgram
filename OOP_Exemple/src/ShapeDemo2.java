import java.util.*;
public class ShapeDemo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] Radius = new double[5];
		double[] Height = new double[5];
		Cylinder[] cylinder = new Cylinder[5];
		for (int i = 0;i<cylinder.length;i++) {
			System.out.print("Input Radius"+ (i+1)+ ": ");
			Radius[i] = scan.nextDouble();
			System.out.print("Input Height"+ (i+1)+ ": ");
			Height[i] = scan.nextDouble(); 
			cylinder[i] = new Cylinder(Radius[i],Height[i]);
		}
		for(int i=0;i<cylinder.length;i++) {
			System.out.println("Cylinder"+(i+1)+","+cylinder[i].getVolume());
		}

	}

}
