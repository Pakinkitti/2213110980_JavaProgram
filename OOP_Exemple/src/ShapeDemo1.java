import java.util.*;
public class ShapeDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Radius : ");
		double Radius = scan.nextDouble();
		System.out.print("Input Height : ");
		double Height = scan.nextDouble();
		
		Circle circle = new Circle(Radius,null);
		System.out.println("Circle["+circle.getArea()+"]");
		System.out.println("Circle["+circle+"]");
		System.out.println();
		Cylinder Cyl = new Cylinder(Radius,Height);
		System.out.println("Cylinder["+Cyl.toString()+"]");
		System.out.println("Cylinder[area ="+Cyl.getArea()+"]");
		System.out.println("Cylinder[volume ="+Cyl.getVolume()+"]");
		
	}

}
