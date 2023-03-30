package controlStatements;
	class Run{
		public void run() {
			System.out.println(" Run Fast ");
		}
	}
	class Jogging extends Run{
		@Override
		public void run() {
			System.out.println(" Do jogging ");
		}
	}
public class Polymorphismv2 {
	public static void main(String[] args) {
		Run object1 = new Run();
		Jogging object2 = new Jogging();
		
		object1.run();
		object2.run();
	}

}
