
public class Rectangle extends Shape {
   private double width;
   private double lenght;
   public Rectangle (double width,double lenght, String color) {
	   super(color);
	   this.width = width;
	   this.lenght = lenght;
   }
   public double getWidth() {
	   return this.width;
   }
   public double getLength() {
	   return this.lenght;
   }
   public double getArea() {
	   return getWidth()*getLength();
   }
   public String toString() {
	   return "Rectangle[width ="+ getWidth()+"length ="+getLength()+","+super.Tostring();
   }
}
