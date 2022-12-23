import java.util.*;
import java.text.*;

public class StockProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Product[] PD = new Product[4];
		for(int i= 0;i < PD.length;i++) {
			PD[i] = new Product();
			System.out.print("Input product Id    : ");
			PD[i].setld(scan.next());
			System.out.print("Input Product Unit  : ");
			PD[i].setUnit(scan.nextInt());
			System.out.print("Input Product Price : ");
			PD[i].setPrice(scan.nextDouble());
			System.out.println();
			
		}
		double sum = 0 ;
		System.out.print("------------------------------------------------");
		System.out.println();
		for(Product PRODUCT : PD) {
			System.out.println("Product ID : "+ PRODUCT.getid()+", Total price = "+frm.format(PRODUCT.calculate())+ "baht.");
			sum+=PRODUCT.calculate();
		}
		System.out.println("------------------------------------------------");
		System.out.print("Total price of all product is "+ frm.format(sum));

		// TODO Auto-generated method stub

	}

}
