
public class Product {
	private String id;
	private int unit;
	private double price;
	private int stock;
	 public void setld(String ID) {
		 id = ID;
	 }
	 public String getid() {
		 return id;
	 }
	 public void setUnit(int UNIT) {
		 unit = UNIT;
	 }
	 public int getUnit() {
		 return unit;
	 }
	 public void setPrice(Double PRICE) {
		 price = PRICE;
	 }
	 public double getPrice() {
		 return price;
	 }
	 public double calculate() {
		 return unit * price;
	 }
	 public String checkstock() {
		 if (stock < 5) {
			 return "LOW" ;
		 }
		 else if(stock >= 5&&stock < 50) {
			 return "NORMAL" ;
		 }
		 else {
			 return "HIGH";
		 }
	 }
}
