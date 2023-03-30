package controlStatements;
public class Main {

	public static void main(String[] args) {
		class Person{

			private String name;
			private int age;

			public String getName() {
				return name;
			}

			public int getAge() {
				return age;
			}

			public void setName( String newName) {
				this.name = newName;
			}

			public void setAge( int newAge ) {
				this.age = newAge;
			}

		}
		Person person = new Person();
		person.setName( "Hnaung" );
		person.setAge(23);
		System.out.println( " Name: " + person.getName());
		System.out.println( " Age: " + person.getAge());


	}

}
