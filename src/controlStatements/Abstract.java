package controlStatements;

abstract class Animal{
	public abstract void ability();
}

class Tiger extends Animal{
	public void ability() {
		System.out.println("I can run.");
	}
}
class Leopard extends Animal{
	public void ability() {
		System.out.println("I can climb tree.");
	}
}
public class Abstract {

	public static void main(String[] args) {
		Tiger animal1 = new Tiger();
		Leopard animal2 = new Leopard();

		animal1.ability();
		animal2.ability();
	}

}
