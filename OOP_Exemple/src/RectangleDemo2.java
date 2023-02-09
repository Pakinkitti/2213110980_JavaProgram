import java.util.*;
public class RectangleDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.print("Input Width ");
		double width = scan.nextDouble();
		System.out.print("Input lenght ");
		double lenght = scan.nextDouble();
		Rectangle2 rec = new Rectangle2(width,lenght);
		System.out.print(rec);
		System.out.println(rec+"\nArea of Rectangle is "+rec.getArea());
	}

}
