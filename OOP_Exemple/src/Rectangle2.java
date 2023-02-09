
public class Rectangle2 implements Shape2{
	   private double width;
	   private double lenght;
	   public Rectangle2 (double width,double lenght) {
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
		   return "Rectangle[width ="+ getWidth()+"length ="+getLength()+","+"color ="+color+"]";
	   }
	}

