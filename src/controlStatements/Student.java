package controlStatements;

class Person{

	private String name;
	protected String schoolName = "Day School ";

	public String name(String newName) {
		this.name = newName;
		return name;
	}
}

public class Student extends Person {
	private int studentID = 1;
	public static void main(String[] args) {
		Student student = new Student();
		System.out.println(" Name: " + student.name(" Mg Mg "));
		System.out.println(" School Name: " + student.schoolName);
		System.out.println(" Student ID: " + student.studentID);
	}

}
