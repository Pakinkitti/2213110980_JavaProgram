import java.util.*;
public class CheckStockProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many product list in stock : ");
		int Stock = scan.nextInt();
		Product[] list = new Product[Stock];
		for(int i= 0;i < list.length;i++) {
			list[i] = new Product();
			System.out.print("Input product Id    : ");
			list[i].setld(scan.next());
			System.out.print("Input Product Unit  : ");
			list[i].setUnit(scan.nextInt());
			System.out.println();
		}
			String[] productstatus = {"LOW","NORMAL","HIGH"};
			for(int i = 0;i < productstatus.length;i++) {
				System.out.println("------------------------------------------------");
				System.out.println("List of product in \'"+ productstatus[i] + "\' status.");
				System.out.println("------------------------------------------------");
				for(Product PD:list) {
					if(productstatus[i].equals("LOW")&&PD.checkstock().equals("LOW")) {
						System.out.println(">> " + PD.getid() + " has " + PD.getUnit() + " units");
					}
					else if (productstatus[i].equals("NORMAL")&&PD.checkstock().equals("NORMAL")) {
						System.out.println(">> " + PD.getid() + " has " + PD.getUnit() + " units");
					}
					else if (productstatus[i].equals("HIGH")&&PD.checkstock().equals("HIGH")) {
						System.out.println(">> " + PD.getid() + " has " + PD.getUnit() + " units");
					}
				}
			}
	}

}
