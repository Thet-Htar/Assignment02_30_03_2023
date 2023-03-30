package controlStatements;

public class AtLeastOneTime {

	public static void main(String[] args) {
		int count = 1;
		do {
			System.out.println(" I work for at least one time:Testing" + count);
			count++;
		}
		while( count < 6 );
	}
}
