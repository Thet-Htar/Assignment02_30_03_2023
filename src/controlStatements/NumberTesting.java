package controlStatements;
import java.util.Scanner;
public class NumberTesting {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print( " Enter a number between 1 to 5: " );
		int number =scan.nextInt();
		while(true) {
		if(number ==  0 || number > 5) {
			System.out.println("Enter a valid number!");
			number = scan.nextInt();
			}else {
				break;
			}
		}
		
		switch(number) {
		case 1:
			System.out.println("The nunber is 1.");
			break;
		case 2:
			System.out.println("The nunber is 2.");
			break;
		case 3:
			System.out.println("The nunber is 3.");
			break;
		case 4:
			System.out.println("The nunber is 4.");
			break;
		case 5:
			System.out.println("The nunber is 5.");
			break;
		}

	}

}