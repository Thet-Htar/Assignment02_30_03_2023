package controlStatements;
	class Area{
		final double PI = 3.14152;
		private double length;
		private double bread;
	
		public double area(double newLength,double newBread) {
			this.length = newLength;
			this.bread = newBread;
			return length * bread;
	}
		@overloading
		public double area(double radius) {
			return Math.pow(radius, 2) * PI;
	}
}
public class Polymorphismv1 {
	public static void main(String[] args) {
		Area square = new Area();
		Area circle = new Area();
		System.out.println(" Square area is : " + square.area(2.5, 5.5));
		System.out.println(" Circle area is :" + circle.area(5.0));
	}
}
