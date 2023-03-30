package controlStatements;
public class TestingArrayPrinting {
	public static void main(String[] args) {
		String[] names = { "Andrew","Arthur","Amelia","Sophia"};
		System.out.println("The Students in Class A are:");
		for(String i : names) {
			System.out.println(i);
		}
	}
}
