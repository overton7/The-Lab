import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String yn;
		System.out.println("Welcome to the Factorial Calculator\n");

		do {
			long number = 1;
			System.out.print("Enter an integer that's greater than 0 but less than 10: ");
			int userSelection = scanner.nextInt();
			for (int i = 1; i < userSelection + 1; i++) {
				number = number * i;
			}
			System.out.println("The factorial of " + userSelection + " is " + number);
			System.out.print("\nContinue? (y/n) ");
			yn = scanner.next();
		} while (yn.equalsIgnoreCase("y"));

		System.out.println("Thank you!");
	}

}
